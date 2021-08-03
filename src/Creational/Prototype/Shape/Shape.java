package Creational.Prototype.Shape;

public abstract class Shape implements Cloneable {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
