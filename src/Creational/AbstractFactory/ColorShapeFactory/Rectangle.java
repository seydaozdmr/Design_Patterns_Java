package Creational.AbstractFactory.ColorShapeFactory;

public class Rectangle implements Shape{
    Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void drawShape() {
        this.color.drawColor();
        System.out.println("this is rectangle");
    }
}
