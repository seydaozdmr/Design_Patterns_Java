package Creational.Prototype.AccountAbstractFactory;

public interface Factory {
    Account createNormalAccount();

    Account createNormalAccount(Customer customer);

    Account createNegativeAccount(Customer customer);

    Account createFrozenAccount(Customer customer);
}
