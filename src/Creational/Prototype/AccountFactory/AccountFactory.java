package Creational.Prototype.AccountFactory;

public class AccountFactory implements Factory{
    private static Account prototype=new Account(1,1000);

    @Override
    public Account create() {
        return prototype.clone();
    }

    @Override
    public Account create(Customer customer){
        Account account=prototype.clone();
        account.setCustomer(customer);
        customer.setAccount(account);
        return account;
    }


}
