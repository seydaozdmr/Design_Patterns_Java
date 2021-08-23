package Behavioral.Command.Account;

import java.util.List;

public abstract class AbstractTransaction implements Transaction{
    protected int amount;
    protected Account account;

    public AbstractTransaction() {
    }

    public void setAccount(Account account){
        this.account=account;
    }

    @Override
    public List<Transaction> getTransaction(){
        return account.getTransactions();
    }

    @Override
    public void redo() {
        execute(amount);
    }

    @Override
    public String toString() {
        return "AbstractTransaction{" +
                "amount=" + amount +
                ", account=" + account +
                '}';
    }
}
