package Structural.Composite.GraphicExample;

public abstract class GraphicObject implements Graphic {
    String name;
    String color;

    public GraphicObject(String name, String color) {
        this.name = name;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GraphicObject{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
