package Creational.AbstractFactory.ColorShapeFactory;

public class App {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new RedShapeFactory();
        Shape square=shapeFactory.createSquare();
        square.drawShape();
    }
}
