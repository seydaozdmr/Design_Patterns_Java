package Structural.Decorator.ToastExample;

import java.util.ArrayList;
import java.util.List;

public class Topping implements Toastable{
    private String name;
    private Toastable toastTopping;
    private int price;

    private List<Topping> toppings=new ArrayList<>();

    public Topping(String name, Toastable toastTopping, int price) {
        this.name = name;
        this.toastTopping = toastTopping;
        this.price = price;
        this.toppings.add(this);
    }



    @Override
    public int calculatePrice() {
        return toastTopping.calculatePrice() + this.price;
    }

    @Override
    public List<Topping> getToppings() {
        List<Topping> toppings=toastTopping.getToppings();
        this.toppings.add(this);
        return toppings;
    }

    public String getName() {
        return name;
    }

    public Toastable getToastTopping() {
        return toastTopping;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", toastTopping=" + toastTopping +
                ", price=" + price +
                '}';
    }
}
