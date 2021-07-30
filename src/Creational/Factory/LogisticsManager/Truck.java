package Creational.Factory.LogisticsManager;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("kara yoluyla dağıtım yap");
    }
}
