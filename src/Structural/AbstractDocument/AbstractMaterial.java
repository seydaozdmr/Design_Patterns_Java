package Structural.AbstractDocument;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class AbstractMaterial implements Material{
    private final Map<String,Object> properties;

    public AbstractMaterial(Map<String, Object> properties) {
        Objects.requireNonNull(properties,"properties map is required");
        this.properties = properties;
    }


    @Override
    public void put(String key, Object value) {
        properties.put(key,value);
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> construction) {
        //referans olarak aldığı fonksiyon new Part() yaratıyor. key(PARTS) 'e karşılık gelen liste get ile alınıyor,
        // map ile Stream List
        // listenin elemanları alınır Stream olarak Part::new yeni bir part nesnesi olarak döndürülür.

        return Stream.ofNullable(get(key))
                .filter(Objects::nonNull)
                .map(e1->(List<Map<String,Object>>)e1)
                .findAny()
                .stream()
                .flatMap(Collection::stream)
                .map(construction);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(getClass().getName()).append("[");
        properties.forEach((key, value) -> builder.append("[").append(key).append(" : ").append(value)
                .append("]"));
        builder.append("]");
        return builder.toString();
    }
}
