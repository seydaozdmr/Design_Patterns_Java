package Structural.Decorator.SalaryExample;

public class DisabilityCompensation extends Compensation{

    public DisabilityCompensation(String name, Compensationable compensationable, double compensation) {
        super(name, compensationable, compensation);
    }
}
