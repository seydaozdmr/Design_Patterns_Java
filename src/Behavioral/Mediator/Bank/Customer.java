package Behavioral.Mediator.Bank;

public class Customer extends Thread implements CustomerInterface{
    private boolean gettingService;
    private Employee employee;
    private BankMediator bankMediator;

    public Customer(String name, boolean gettingService, BankMediator bankMediator) {
        super(name);
        this.gettingService = gettingService;
        this.bankMediator = bankMediator;
        bankMediator.receive(this);
    }

    @Override
    public void approach() {
        System.out.println("this customer is :"+getName()+ " is approaching employee"+ employee.getName());
    }

    @Override
    public void proceed() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Customer " + getName() + " is proceeding through employee " + employee.getName());
        bankMediator.done(this);
    }

    @Override
    public void waitService() {
        gettingService=false;
        System.out.println("Customer " + getName() + " is waiting for service");
    }

    @Override
    public void waitForAWhile() {
        System.out.println("Customer "+ getName()+ " is waiting");
        try{
            Thread.currentThread().sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        bankMediator.askPermitToService(this);
    }

    public void run() {
        System.out.println("Customer "+getName()+ " is asking permit to service ");
        bankMediator.askPermitToService(this);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
