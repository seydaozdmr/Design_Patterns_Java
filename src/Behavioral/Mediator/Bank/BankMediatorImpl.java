package Behavioral.Mediator.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankMediatorImpl implements BankMediator{
    private String name;
    private List<Customer> customerList;
    private List<Employee> activeEmployees;
    int numberOfActiveEmployees=0;

    public BankMediatorImpl(String name) {
        this.name = name;
        this.customerList=new ArrayList<>();
        this.activeEmployees=new ArrayList<>();
    }

    @Override
    public void receive(Customer customer) {
        customer.waitService();
        customerList.add(customer);
    }

    @Override
    public void askPermitToService(Customer customer) {
        Employee employee=getEmployee();

        if(employee!=null){
            customer.setEmployee(employee);
            try {
                Thread.sleep(500);
                customer.proceed();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else{
            customer.waitForAWhile();
        }
    }

    @Override
    public void done(Customer customer) {
        activeEmployees.add(customer.getEmployee());
        numberOfActiveEmployees++;
        customerList.remove(customer);

    }

    public Employee getEmployee(){
        Employee employee=null;
        boolean isDone=false;
        while(!isDone){
            System.out.println("searching active employee");
            if(!activeEmployees.isEmpty()){
                employee= activeEmployees.get(numberOfActiveEmployees-1);
                numberOfActiveEmployees-=1;
                activeEmployees.remove(employee);
                isDone=true;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return employee;
    }

    public void waitingForCustomer(Employee employee){
        if(!customerList.isEmpty()){
            activeEmployees.add(employee);
            numberOfActiveEmployees++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
