package Structural.Decorator.SalaryExample;

import java.util.ArrayList;
import java.util.List;

public class Compensation implements Compensationable {
    private String name;
    private Compensationable compensationable;
    private double compensation;

    List<Compensation> compensationList=new ArrayList<>();

    public Compensation(String name, Compensationable compensationable, double compensation) {
        this.name = name;
        this.compensationable = compensationable;
        this.compensation = compensation;
        List<Compensation> compensations=compensationable.compensationList();
        compensations.add(this);
        compensationList=compensations;
    }

    @Override
    public double calculateSalary() {
        return compensationable.calculateSalary() + this.compensation;
    }

    @Override
    public List<Compensation> compensationList() {
        return this.compensationList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Compensation{" +
                "name='" + name + '\'' +
                '}';
    }
}
