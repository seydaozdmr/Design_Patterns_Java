package Structural.Adapter.RoundHoleAdapterExample;

public class RoundPeg {
    private int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }

    public int getRadius(){
        return radius;
    }
}
