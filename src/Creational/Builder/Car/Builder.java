package Creational.Builder.Car;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setGps(Gps gps);
    Car build();

}
