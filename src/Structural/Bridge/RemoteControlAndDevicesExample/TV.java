package Structural.Bridge.RemoteControlAndDevicesExample;


import java.util.ArrayList;
import java.util.List;

public class TV implements Device{
    private boolean on;
    private List<Channel> channels=new ArrayList<>();
    private int volume=0;

    public TV() {
        this.on=false;
        channels.add(new Channel("TRT",1));
        channels.add(new Channel("Kanal D",2));
        channels.add(new Channel("Star",3));
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on=true;
    }

    @Override
    public void disable() {
        this.on=false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int value) {
        if(!(this.volume>100)){
            this.volume+=value;
        }
    }

    @Override
    public Channel getChannel(int no) {
        return channels.stream().filter(k->k.getNo()==no).findFirst().get();
    }

    @Override
    public void setChannel(Channel channel) {
        channels.add(channel);
    }
}
