package Structural.Composite.GraphicExample;

import java.util.Collection;

public interface CompositeGraphic {
    void addGraphic(Graphic graphic);
    void removeGraphic(Graphic graphic);
    Collection<Graphic> getGraphics();
    void listGraphic();
}
