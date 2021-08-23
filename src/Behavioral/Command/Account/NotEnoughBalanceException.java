package Behavioral.Command.Account;

public class NotEnoughBalanceException extends Exception {
    private int balance;
    private int amount;

    @Override
    public String getMessage() {
        return balance +" is not inadequate "+ amount + " is too much...";
    }

    public NotEnoughBalanceException(int balance, int amount) {
        this.amount=amount;
        this.balance=balance;
    }
}
