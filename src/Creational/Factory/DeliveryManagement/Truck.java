package Creational.Factory.DeliveryManagement;

public class Truck implements Transport{
    @Override
    public void makeDelivery() {
        System.out.println("truck delivery");
    }
}
