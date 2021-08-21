package Structural.Decorator.SalaryExample;

public class Test {
    public static void main(String[] args) {
        Compensationable employee=new Employee("Seyda",1000);
        employee=new ForeignLanguageCompensation("yabancı dil tazminatı",employee,300);
        //System.out.println(employee.calculateSalary());
        employee=new DisabilityCompensation("engelli tazminatı",employee,100);

        printCompensation(employee);
    }

    private static void printCompensation(Compensationable compensationable){
        for(Compensation c: compensationable.compensationList()){
            System.out.println(c);
        }

    }
}
