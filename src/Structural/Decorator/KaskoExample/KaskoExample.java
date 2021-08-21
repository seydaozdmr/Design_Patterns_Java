package Structural.Decorator.KaskoExample;

import java.util.ArrayList;
import java.util.List;

public class KaskoExample implements Kasko{
    private String name;
    private double price;

    public KaskoExample(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double price() {
        return this.price;
    }

    @Override
    public List<Kasko> primList() {
        List<Kasko> list=new ArrayList<>();
        list.add(this);
        return list;
    }

    @Override
    public String toString() {
        return "KaskoExample{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
