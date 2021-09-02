package Structural.Flyweight.ForestExample;

import java.awt.*;
import java.util.Objects;

public class TreeType{
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Canvas canvas,int x,int y){
        System.out.println("drawing");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeType treeType = (TreeType) o;
        return Objects.equals(name, treeType.name) && Objects.equals(color, treeType.color) && Objects.equals(texture, treeType.texture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, texture);
    }


}
