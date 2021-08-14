package Structural.Adapter.ApplianceExample;

public class Test {
    public static void main(String[] args) {
        TurkishPowerSource powerSource=new TurkishPowerProvider();
        HomeAppliance homeAppliance=new TurkishHomeAppliance("ütü");
        homeAppliance.setPowerSource(powerSource);
        homeAppliance.start();

        USPowerSource usPowerSource=new USPowerProvider();
        USTurkishPowerAdaptor adaptor=new USTurkishPowerAdaptor(usPowerSource);
        homeAppliance.setPowerSource(adaptor);
        homeAppliance.start();

    }
}
