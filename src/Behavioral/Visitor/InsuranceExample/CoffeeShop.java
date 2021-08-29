package Behavioral.Visitor.InsuranceExample;

public class CoffeeShop implements Building{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doInsurance() {
        System.out.println("fire and flood insurance");
    }
}
