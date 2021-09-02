package Structural.AbstractDocument;

import java.util.Optional;

public interface HasType extends Material{

    default Optional<String> getType(){
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
