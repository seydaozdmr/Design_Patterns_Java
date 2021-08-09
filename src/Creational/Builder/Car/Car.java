package Creational.Builder.Car;

public class Car {
    protected int seats;
    protected Engine engine;
    protected TripComputer tripComputer;
    protected Gps gps;


    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
