package Behavioral.Command.Account;

public class AccountFactory implements Factory{
    private static AccountFactory accountFactory;

    static{
        accountFactory=new AccountFactory();
    }

    @Override
    public Account createAccount(int amount) {
        return new Account(amount);
    }

    public static AccountFactory getInstance(){
        return accountFactory;
    }
}
