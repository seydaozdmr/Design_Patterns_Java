package Concurrency.ActiveObject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ActiveAccount {
    private BlockingQueue<Runnable> transactions;

    private String name;
    private double amount;
    private Thread thread;
    private int status;

    public ActiveAccount(String name,double amount) {
        this.name = name;
        this.status=0;
        this.amount=amount;

        this.transactions=new LinkedBlockingQueue<>();

        thread=new Thread(()-> {
            boolean infinite=true;
            while(infinite){
                try{
                    System.out.println(Thread.currentThread().getName()+" is working");
                    transactions.take().run();

                }catch (InterruptedException e){
                    if(this.status!=0){
                        System.out.println("Thread was interrupted."+ e.getMessage());
                    }
                    System.out.println("stopping working");
                    infinite=false;
                    Thread.currentThread().interrupt();
                }
            }
        });
        thread.start();
    }

    public void withdraw(double amount) throws InterruptedException {
        transactions.put(()->{
            if(this.amount>=amount){
                System.out.println("withdrawing account :"+amount + " name : "+getName());
                this.amount-=amount;
                System.out.println("account amount: "+this.amount + " name : "+getName());
            }else{
                System.out.println("you can not withdraw account amount is not enough" + " name : "+getName());
            }
        });
    }

    public void deposit(double amount) throws InterruptedException {
        transactions.put(()->{
            System.out.println("depositing amount :"+amount + " name : "+getName());
            this.amount+=amount;
            System.out.println("account amount :"+this.amount + " name : "+getName() );
        });
    }

    public String getName(){
        return this.name;
    }

    public void kill(int status){
        this.status=status;
        this.thread.interrupt();
    }

    public int getStatus(){
        return this.status;
    }

    @Override
    public String toString() {
        return "ActiveAccount{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
