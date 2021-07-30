package Creational.Factory.DeliveryManagement;

public class Train implements Transport{

    @Override
    public void makeDelivery() {
        System.out.println("train delivery");
    }
}
