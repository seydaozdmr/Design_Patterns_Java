package Behavioral.Visitor.InsuranceExample;

public interface Visitor {
    void visit(Residential residential);
    void visit(Bank bank);
    void visit(CoffeeShop coffeeShop);
}
