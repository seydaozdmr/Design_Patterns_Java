package Concurrency.Balking;

import java.util.concurrent.TimeUnit;

public class Car {
    private final DelayProvider delayProvider;
    private CarState carState;

    public Car() {
        this((interval,timeUnit,task) ->{
            try{
                Thread.sleep(timeUnit.toMillis(interval));
            }catch (InterruptedException ie){
                System.out.println(""+ie);
                Thread.currentThread().interrupt();
            }
            task.run();
        });
    }

    public Car(DelayProvider delayProvider){
        this.delayProvider=delayProvider;
        this.carState=CarState.ENABLED;
    }

    public CarState getCarState(){
        return this.carState;
    }

    public void runCar(){
        synchronized (this){
            CarState state= getCarState();
            System.out.println("Actual car state: "+ Thread.currentThread().getName() + " : "+state);
            if(this.carState==CarState.RUNNING){
                System.out.println("Cannot run car if the car has been already driving.");
                return;
            }
            this.carState=CarState.RUNNING;
        }

        System.out.println(Thread.currentThread().getName() + "  driving car");
        this.delayProvider.executeAfterDelay(50, TimeUnit.MILLISECONDS,this::runCar);
    }

    public synchronized void endOfRunning(){
        carState=CarState.ENABLED;
        System.out.println("Driving completed. "+ Thread.currentThread().getId());
    }
}
