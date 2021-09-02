package Structural.AbstractDocument;

import java.util.Map;

public class Food extends AbstractMaterial implements HasParts,HasPrice,HasBrand{
    public Food(Map<String, Object> properties) {
        super(properties);
    }
}
