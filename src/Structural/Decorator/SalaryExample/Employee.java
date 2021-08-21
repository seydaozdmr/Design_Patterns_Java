package Structural.Decorator.SalaryExample;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Compensationable{
    private String name;

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public List<Compensation> compensationList(){
        return new ArrayList<>();
    }
}
