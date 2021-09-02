package Structural.Flyweight.FlyweightExample;

public class Particle {
    private String color;
    private String sprite;

    private int vector;
    private int coords;
    private int speed;

    public Particle(String color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }

    public String getColor() {
        return color;
    }

    public String getSprite() {
        return sprite;
    }

    public int getVector() {
        return vector;
    }

    public int getCoords() {
        return coords;
    }

    public int getSpeed() {
        return speed;
    }

    public Particle operation(int vector, int coords, int speed) {
        this.vector=vector;
        this.coords=coords;
        this.speed=speed;
        return this;
    }

    @Override
    public String toString() {
        return "Particle{" +
                "color='" + color + '\'' +
                ", sprite='" + sprite + '\'' +
                ", vector=" + vector +
                ", coords=" + coords +
                ", speed=" + speed +
                '}';
    }
}
