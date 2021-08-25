package Behavioral.Mediator.Traffic;

public class App {
    public static void main(String[] args) {
        Junction junction1=new Junction("Kavşak-1");
        TrafficMediator mediator=new TrafficPolice("Kazım Polis",junction1);

        int numberOfCars=50;
        Thread[] cars=new Thread[numberOfCars];

        for(int i=0;i<numberOfCars;i++){
            cars[i]=new Car("Car-"+i,true,junction1,mediator);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(Thread car:cars){
            car.start();
        }
    }
}
