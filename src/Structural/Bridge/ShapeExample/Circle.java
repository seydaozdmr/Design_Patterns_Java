package Structural.Bridge.ShapeExample;

public class Circle extends Shape{

    public Circle(Color color){
        this.color=color;
    }

    @Override
    public void draw() {
        color.addColor();
        System.out.println(color.getClass().getSimpleName()+" circle drawing...");
    }
}
