package Concurrency.ActiveObject;

import java.util.ArrayList;
import java.util.List;

public class App implements Runnable{
    private static  final int NUM_ACCOUNT=5;

    public static void main(String[] args) {
        App app=new App();
        app.run();
    }

    @Override
    public void run() {
        List<ActiveAccount> activeAccounts=new ArrayList<>();
        try{
            for(int i=0;i<NUM_ACCOUNT;i++){
                activeAccounts.add(new RegularAccount(RegularAccount.class.getName() + i,100*i));
                activeAccounts.get(i).deposit(Math.random()*1000);
                activeAccounts.get(i).withdraw(Math.random()*1000);
            }
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }finally {
            for(ActiveAccount account:activeAccounts){
                System.out.println(account);
            }
            for(int i=0;i<NUM_ACCOUNT;i++)
                activeAccounts.get(i).kill(0);
        }
    }
}
