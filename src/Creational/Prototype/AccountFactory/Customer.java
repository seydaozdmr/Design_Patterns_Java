package Creational.Prototype.AccountFactory;

public class Customer {
    private int id;
    private String name;
    private Account account;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
