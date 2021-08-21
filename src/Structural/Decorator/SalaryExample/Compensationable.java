package Structural.Decorator.SalaryExample;

import java.util.List;

public interface Compensationable {
    double calculateSalary();
    List<Compensation> compensationList();
}
