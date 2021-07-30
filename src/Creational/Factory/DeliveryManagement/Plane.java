package Creational.Factory.DeliveryManagement;

public class Plane implements Transport{
    @Override
    public void makeDelivery() {
        System.out.println("plane delivery");
    }
}
