package Creational.AbstractFactory.ColorShapeFactory;

public class BlueShapeFactory implements ShapeFactory{

    @Override
    public Shape createRectangle() {
        return new Rectangle(new Blue());
    }

    @Override
    public Shape createSquare() {
        return new Square(new Blue());
    }
}
