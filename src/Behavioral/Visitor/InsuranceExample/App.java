package Behavioral.Visitor.InsuranceExample;

public class App {
    public static void main(String[] args) {
        Visitor visitor=new ConcreteVisitor();

        Building bank=new Bank();
        bank.accept(visitor);
        
    }
}
