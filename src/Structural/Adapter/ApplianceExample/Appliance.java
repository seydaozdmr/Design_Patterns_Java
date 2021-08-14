package Structural.Adapter.ApplianceExample;

public interface Appliance {

    void setPowerSource(TurkishPowerSource powerSource);
    void start();
    void stop();
}
