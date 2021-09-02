package Structural.AbstractDocument;

import java.util.Optional;

public interface HasBrand extends Material{
    default Optional<String> getBrand(){
        return Optional.ofNullable((String) get(Property.BRAND.toString()));
    }
}
