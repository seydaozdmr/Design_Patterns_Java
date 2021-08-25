package Behavioral.Mediator.Bank;

public class Employee  extends Thread{
    private String name;
    private boolean busy;
    private BankMediator bankMediator;

    public Employee(String name,BankMediator bankMediator) {
        this.name = name;
        busy=false;
        this.bankMediator=bankMediator;
        System.out.println("Employee "+name+" is created..");
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void run(){
        System.out.println("Employee :"+getName()+ " waiting for customer service");
        bankMediator.waitingForCustomer(this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
