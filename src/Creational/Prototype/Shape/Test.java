package Creational.Prototype.Shape;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> shapeList=new ArrayList<>();

        Circle circle=new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapeList.add(circle);

        Shape anotherCircle=circle.clone();
        shapeList.add(anotherCircle);

        System.out.println(anotherCircle instanceof Circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        shapeList.add(rectangle);

        Shape anotherRectangel=null;
        try {
           anotherRectangel=rectangle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        shapeList.add(anotherRectangel);


        for(Shape shape:shapeList){
            System.out.println(shape);
        }





    }
}
