package Creational.AbstractFactory.ColorShapeFactory;

public class Square implements Shape{
    Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void drawShape() {
        this.color.drawColor();
        System.out.println("this is square");
    }
}
