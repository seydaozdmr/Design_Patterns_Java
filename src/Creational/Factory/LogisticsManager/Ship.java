package Creational.Factory.LogisticsManager;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("su yolu ile dağıtım yap");
    }
}
