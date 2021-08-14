package Structural.Adapter.RoundHoleAdapterExample;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public boolean fits(RoundPeg roundPeg){
        return this.radius>roundPeg.getRadius();
    }
}
