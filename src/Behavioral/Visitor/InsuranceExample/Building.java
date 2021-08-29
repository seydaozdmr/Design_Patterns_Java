package Behavioral.Visitor.InsuranceExample;

public interface Building {
    void accept(Visitor visitor);
    void doInsurance();
}
