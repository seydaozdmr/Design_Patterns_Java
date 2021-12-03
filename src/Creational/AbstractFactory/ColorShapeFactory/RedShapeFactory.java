package Creational.AbstractFactory.ColorShapeFactory;

public class RedShapeFactory implements ShapeFactory{
    @Override
    public Shape createRectangle() {
        return new Rectangle(new Red());
    }

    @Override
    public Shape createSquare() {
        return new Square(new Red());
    }
}
