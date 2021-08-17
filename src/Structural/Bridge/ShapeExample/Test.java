package Structural.Bridge.ShapeExample;

public class Test {
    public static void main(String[] args) {
        Color blue=new Blue();
        Shape shape=new Circle(blue);
        shape.draw();
    }
}
