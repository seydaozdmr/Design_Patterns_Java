package Creational.Prototype.AccountAbstractFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory=new AccountFactory();
        Customer customer=new Customer(1,"hasan");
        Account account=factory.createNormalAccount(customer);
        System.out.println(account);

        account=factory.createFrozenAccount(customer);
        System.out.println(account);

        account=factory.createNegativeAccount(customer);
        System.out.println(account);

    }
}
