package Creational.Prototype.AccountFactory;

public class Account implements Cloneable{
    private int id;
    private double balance;
    private Customer customer;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    protected Account clone()  {
        Account account=null;
        try {
            account= (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
