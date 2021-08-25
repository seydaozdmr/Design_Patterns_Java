package Behavioral.Mediator.Bank;

public class Test {
    public static void main(String[] args) {
        BankMediator bankMediator=new BankMediatorImpl("BankA");

        int numberOfEmployees=5;
        Thread[]employees=new Thread[numberOfEmployees];
        for(int i=0;i<numberOfEmployees;i++){
            employees[i]=new Employee("Employee-"+i,bankMediator);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println("Bank is opened...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int numberOfCustomer=20;
        Thread[] customers=new Thread[numberOfCustomer];
        for(int i=0;i<20;i++){
            customers[i]=new Customer("Customer-"+i,true,bankMediator);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(Thread thread:employees){
            thread.start();
        }

        for(Thread thread:customers){
            thread.start();
        }


    }
}
