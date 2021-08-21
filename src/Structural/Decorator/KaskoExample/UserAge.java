package Structural.Decorator.KaskoExample;

public class UserAge extends KaskoBase{
    private int age;

    public UserAge(String name, Kasko kasko, double price,int age) {
        super(name, kasko, price);
        this.age=age;
    }

    @Override
    public double price() {
        if(age>40){
            return super.price()+300;
        }
        return super.price();
    }
}

