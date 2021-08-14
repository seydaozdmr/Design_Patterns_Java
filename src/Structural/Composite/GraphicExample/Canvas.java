package Structural.Composite.GraphicExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Canvas extends GraphicObject implements CompositeGraphic{
    List<Graphic> myGraphics;

    public Canvas(String name, String color) {
        super(name, color);
        myGraphics=new ArrayList<>();
    }

    @Override
    public void addGraphic(Graphic graphic) {
        myGraphics.add(graphic);
    }

    @Override
    public void removeGraphic(Graphic graphic) {
        myGraphics.removeIf(g -> graphic==g);
    }

    @Override
    public Collection<Graphic> getGraphics() {
        return myGraphics;
    }

    @Override
    public void listGraphic() {
        myGraphics.forEach(System.out::println);
    }

    @Override
    public void draw() {

    }

    @Override
    public void erase() {

    }

    @Override
    public void paint() {

    }
}
