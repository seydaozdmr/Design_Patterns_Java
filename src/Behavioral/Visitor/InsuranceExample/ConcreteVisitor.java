package Behavioral.Visitor.InsuranceExample;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(Residential residential) {
        System.out.println("i am visiting residential...");
        residential.doInsurance();
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("i am visiting bank...");
        bank.doInsurance();
    }

    @Override
    public void visit(CoffeeShop coffeeShop) {
        System.out.println("i am visiting coffee shop...");
        coffeeShop.doInsurance();
    }
}
