package Behavioral.Command.Account;

import java.util.List;

public interface Transaction {
    void execute(int amount);
    void redo();
    void undo() throws NotEnoughBalanceException;
    List<Transaction> getTransaction();
    void setAccount(Account account);
}
