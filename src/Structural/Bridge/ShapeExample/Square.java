package Structural.Bridge.ShapeExample;

public class Square extends Shape{
    public Square (Color color){
        this.color=color;
    }

    @Override
    public void draw() {
        color.addColor();
        System.out.println(color.getClass().getSimpleName()+" square drawing...");

    }
}
