package Behavioral.Visitor.InsuranceExample;

public class Bank implements Building{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doInsurance() {
        System.out.println("theft insurance");
    }
}
