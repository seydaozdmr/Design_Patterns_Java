package Structural.Decorator.KaskoExample;

public class CarOld extends KaskoBase{
    private int age;
    public CarOld(String name, Kasko kasko, double price,int age) {
        super(name, kasko, price);
        this.age=age;
    }

    @Override
    public double price() {
        if(this.age<5){
            return super.price()+1000;
        }else {
            return super.price() + 500;
        }
    }
}
