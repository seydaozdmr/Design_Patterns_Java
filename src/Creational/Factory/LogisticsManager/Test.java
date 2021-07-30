package Creational.Factory.LogisticsManager;

public class Test {
    public static void main(String[] args) {
        Logistics logistics=new RoadLogistic();
        Transport transport= logistics.createTransport();
        transport.deliver();
    }
}
