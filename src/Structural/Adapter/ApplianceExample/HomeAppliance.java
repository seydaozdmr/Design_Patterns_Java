package Structural.Adapter.ApplianceExample;

public abstract class HomeAppliance implements Appliance {
    String name;
    TurkishPowerSource turkishPowerSource;
    public HomeAppliance(String name) {
        this.name = name;
    }

    @Override
    public void setPowerSource(TurkishPowerSource powerSource) {
        this.turkishPowerSource=powerSource;
    }


}
