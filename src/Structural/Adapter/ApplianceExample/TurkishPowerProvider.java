package Structural.Adapter.ApplianceExample;

public class TurkishPowerProvider implements TurkishPowerSource{
    @Override
    public void providePowerAt220V() {
        System.out.println("providing 220V");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off...");
    }
}
