package Structural.AbstractDocument;

import java.util.Map;

public class Part extends AbstractMaterial implements HasType,HasBrand,HasPrice{
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
