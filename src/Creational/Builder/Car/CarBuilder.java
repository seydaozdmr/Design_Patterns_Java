package Creational.Builder.Car;

public class CarBuilder implements Builder{
    private Car car;

    @Override
    public void reset() {
        car=new Car();
    }

    @Override
    public void setSeats(int number) {
        car.seats=number;
    }

    @Override
    public void setEngine(Engine engine) {
        car.engine=engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        car.tripComputer=tripComputer;
    }

    @Override
    public void setGps(Gps gps) {
        car.gps=gps;
    }

    @Override
    public Car build() {
        return car;
    }
}
