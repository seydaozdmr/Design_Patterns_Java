package Structural.Bridge.RemoteControlAndDevicesExample;

public abstract class Remote {
    protected Device device;
    public Remote(Device device) {
        this.device = device;
    }
    abstract public void togglePower();
    abstract public void volumeDown();
    abstract public void volumeUp();
}
