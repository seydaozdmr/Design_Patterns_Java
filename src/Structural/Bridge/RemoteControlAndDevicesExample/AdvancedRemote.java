package Structural.Bridge.RemoteControlAndDevicesExample;

public class AdvancedRemote extends Remote{

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if(device.isEnabled()){
            device.disable();
        }else{
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume(-1);
    }

    @Override
    public void volumeUp() {
        device.setVolume(1);
    }
}
