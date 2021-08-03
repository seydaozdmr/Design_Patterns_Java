package Creational.Prototype.AccountFactory;

public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer(1,"Hasan");
        Factory factory=new AccountFactory();
        Account account= factory.create(customer);

        System.out.println(account);

    }
}
