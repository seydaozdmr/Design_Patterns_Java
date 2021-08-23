package Behavioral.Command.Account;

public class Withdraw extends AbstractTransaction{


    @Override
    public void execute(int amount) {
        this.amount=amount;
        try{
            this.account.withdraw(amount);

        }catch (NotEnoughBalanceException e){
            System.out.println("Can't withdraw " +e.getMessage());
        }
        account.addTransaction(this);

    }

    @Override
    public void undo() {
        this.account.deposit(amount);
        account.addTransaction(this);
    }
}
