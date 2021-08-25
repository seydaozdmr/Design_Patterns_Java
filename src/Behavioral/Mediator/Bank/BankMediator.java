package Behavioral.Mediator.Bank;

public interface BankMediator {
    void receive(Customer customer);
    void askPermitToService(Customer customer);
    void done (Customer customer);
    void waitingForCustomer(Employee employee);
    Employee getEmployee();

}
