package Structural.Adapter.ApplianceExample;

public class TurkishHomeAppliance extends HomeAppliance{

    public TurkishHomeAppliance(String name) {
        super(name);
    }

    @Override
    public void start() {
        turkishPowerSource.turnOn();
    }

    @Override
    public void stop() {
        turkishPowerSource.turnOff();
    }
}
