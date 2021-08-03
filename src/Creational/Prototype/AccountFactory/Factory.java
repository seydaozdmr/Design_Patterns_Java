package Creational.Prototype.AccountFactory;

public interface Factory {
    Account create() throws CloneNotSupportedException;

    Account create(Customer customer);
}
