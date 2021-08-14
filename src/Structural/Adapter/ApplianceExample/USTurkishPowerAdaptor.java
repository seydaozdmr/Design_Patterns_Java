package Structural.Adapter.ApplianceExample;

public class USTurkishPowerAdaptor implements TurkishPowerSource{
    USPowerSource usPowerSource;
    private boolean on;

    public USTurkishPowerAdaptor(USPowerSource usPowerSource) {
        this.usPowerSource = usPowerSource;
    }

    @Override
    public void providePowerAt220V() {
        convert110To220(usPowerSource);
    }

    @Override
    public void turnOn() {
        if(!on){
            usPowerSource.pushSwitch();
            on=true;
            System.out.println("turning on...");
        }
    }

    @Override
    public void turnOff() {
        if(on){
            usPowerSource.pushSwitch();
            on=false;
            System.out.println("turning off...");
        }

    }

    private void convert110To220(USPowerSource usPowerSource){
        usPowerSource.providePowerAt110V();
    }
}
