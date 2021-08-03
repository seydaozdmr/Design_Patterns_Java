package Creational.Prototype.AccountAbstractFactory;

public class AccountFactory implements Factory {
    //bu alanları static inner class içerisinde tanımlayıp çağırabiliriz.
    private static Account prototype=new Account(1,1000,true,true,true);
    private static Account frozenAccount=new Account(1,1000,false,false,false);
    private static Account negativeAccount=new Account(1,1000,true,true,false);

    @Override
    public Account createNormalAccount() {
        return prototype;
    }

    @Override
    public Account createNormalAccount(Customer customer) {
        Account account=prototype.clone();
        account.setCustomer(customer);
        customer.setAccount(account);
        return account;
    }

    @Override
    public Account createNegativeAccount(Customer customer) {
        //bu hesap yalnızca transfer yapamaz.
        Account account=negativeAccount.clone();
        account.setCustomer(customer);
        customer.setAccount(account);
        return account;
    }

    @Override
    public Account createFrozenAccount(Customer customer) {
        //bu hesap hiç bir işlem yapamaz...
        Account account=frozenAccount.clone();
        account.setCustomer(customer);
        customer.setAccount(account);
        return account;
    }
}
