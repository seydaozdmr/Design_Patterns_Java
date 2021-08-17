package Structural.Bridge.RemoteControlAndDevicesExample;

public class Channel {
    private String name;
    private int no;

    public Channel(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }
}
