package Behavioral.Command.Account;

public class Deposit extends AbstractTransaction{

    @Override
    public void execute(int amount) {
        this.amount=amount;
        account.deposit(amount);
        account.addTransaction(this);
    }

    @Override
    public void undo() throws NotEnoughBalanceException {
        account.withdraw(amount);
        account.addTransaction(this);
    }
}
