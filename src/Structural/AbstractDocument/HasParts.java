package Structural.AbstractDocument;

import java.util.Optional;
import java.util.stream.Stream;

public interface HasParts extends Material {
    default Stream<Part> getParts(){
        return children(Property.PARTS.toString(),Part::new);
    }
}
