package Structural.Adapter.ApplianceExample;

public class USPowerProvider implements USPowerSource{
    @Override
    public void providePowerAt110V() {
        System.out.println("providing 110 V US Power");
    }

    @Override
    public void pushSwitch() {
        System.out.println("pushing the button");
    }
}
