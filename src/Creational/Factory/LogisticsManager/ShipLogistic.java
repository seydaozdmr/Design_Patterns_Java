package Creational.Factory.LogisticsManager;

public class ShipLogistic implements Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
