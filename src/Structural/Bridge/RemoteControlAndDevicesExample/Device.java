package Structural.Bridge.RemoteControlAndDevicesExample;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int value);
    Channel getChannel(int no);
    void setChannel(Channel channel);
}
