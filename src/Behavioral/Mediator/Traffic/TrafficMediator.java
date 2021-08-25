package Behavioral.Mediator.Traffic;

public interface TrafficMediator {
    void receive(Vehicle vehicle);
    void askPermitToPass(Vehicle vehicle);
    void done (Vehicle vehicle);
}
