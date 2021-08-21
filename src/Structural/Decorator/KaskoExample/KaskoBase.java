package Structural.Decorator.KaskoExample;

import java.util.ArrayList;
import java.util.List;

public class KaskoBase implements Kasko{
    private String name;
    private Kasko kasko;
    private double price;
    private List<Kasko> kaskos=new ArrayList<>();

    public KaskoBase(String name, Kasko kasko, double price) {
        this.name = name;
        this.kasko = kasko;
        this.price = price;
        kaskos=kasko.primList();
        kaskos.add(this);
    }

    @Override
    public double price() {
        return kasko.price()+this.price;
    }

    @Override
    public List<Kasko> primList() {
        return this.kaskos;
    }

    @Override
    public String toString() {
        return "KaskoBase{" +
                "name='" + name + '\'' +
                ", price=" + price() +
                '}';
    }
}
