package Behavioral.Command.Account;

public class Test {
    public static void main(String[] args) {
        Factory accountFactory=new AccountFactory();
        Account myAccount= accountFactory.createAccount(1000);

        Transaction withDrawTransaction=new Withdraw();

        withDrawTransaction.setAccount(myAccount);

        withDrawTransaction.execute(500);

        System.out.println(myAccount);

        Transaction depositTransaction=new Deposit();

        depositTransaction.setAccount(myAccount);

        depositTransaction.execute(2500);
        System.out.println(myAccount);

    }
}
