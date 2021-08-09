package Creational.Builder.Car;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director(){}

    void construcSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine());
        builder.setGps(new Gps());
        builder.setTripComputer(new TripComputer());
    }
}
