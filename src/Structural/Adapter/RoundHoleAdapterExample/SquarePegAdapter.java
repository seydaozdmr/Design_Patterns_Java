package Structural.Adapter.RoundHoleAdapterExample;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg=squarePeg;
    }

    @Override
    public int getRadius() {
        return squarePeg.getWidth()*((int) Math.sqrt(2)/2);
    }
}
