package Behavioral.Mediator.Traffic;

public class Car extends Thread implements Vehicle{
    private boolean moving; //moving state
    private Junction junction;
    private TrafficMediator mediator;

    public Car(String name, boolean moving, Junction junction, TrafficMediator mediator) {
        super(name);
        this.moving = moving;
        this.junction = junction;
        this.mediator = mediator;
        //araç yaratılırken kavşağa yanaşıyor ve mediator'e geldiğini bildiriyor
        //mediator aracı durduruyor ve kuyruğa alıyor
        approach();
        mediator.receive(this);
    }

    //kavşağa yaklaşıyor
    @Override
    public void approach() {
        System.out.println("Car " + getName() + " is approaching to junction " + junction.getName());
    }

    //kavşaktan geçiyor
    @Override
    public void proceed() {
        System.out.println("Car " + getName() + " is proceeding through junction " + junction.getName());
        mediator.done(this); //kendisi geçti mediator'a bu bilgiyi veriyor
    }

    @Override
    public void stopp() {
        moving = false;
        System.out.println("Car " + getName() + " has stopped.");
    }

    @Override
    public void waitForAWhile() {
        System.out.println("Car "+ getName()+ " is waiting");
        try{
            Thread.currentThread().sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        mediator.askPermitToPass(this);
    }

    public void run(){
        System.out.println("Car "+getName()+ " is asking permit to pass junction "+ junction.getName());
        mediator.askPermitToPass(this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
