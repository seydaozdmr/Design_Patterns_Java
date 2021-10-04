package Structural.Decorator.ToastExample;

import java.util.ArrayList;
import java.util.List;

public class ToastBread implements Toastable{
    private String name;
    private int price;

    public ToastBread(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int calculatePrice() {
        return price;
    }

    @Override
    public List<Topping> getToppings() {
        return new ArrayList<>();
    }
}
