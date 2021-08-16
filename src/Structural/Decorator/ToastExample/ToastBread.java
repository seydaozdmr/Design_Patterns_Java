package Structural.Decorator.ToastExample;

import java.util.ArrayList;
import java.util.List;

public class ToastBread implements Toastable{
    private String name;
    private int price;


    @Override
    public int calculatePrice() {
        return price;
    }

    @Override
    public List<Topping> getToppings() {
        return new ArrayList<>();
    }
}
