package Structural.AbstractDocument;

import java.util.Optional;

public interface HasPrice extends Material{
    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));

    }
}
