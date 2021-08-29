package Behavioral.Visitor.InsuranceExample;

public class Residential implements Building{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doInsurance() {
        System.out.println("medical insurance");
    }
}
