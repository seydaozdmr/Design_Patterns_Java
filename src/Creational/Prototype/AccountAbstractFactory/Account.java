package Creational.Prototype.AccountAbstractFactory;

public class Account implements Cloneable{
    private int id;
    private double balance;
    private Customer customer;
    private boolean OpenToWithdraw;
    private boolean OpenToPayment;
    private boolean OpenToTransfer;

    public Account(int id, double balance, boolean openToWithdraw, boolean openToPayment, boolean openToTransfer) {
        this.id = id;
        this.balance = balance;
        OpenToWithdraw = openToWithdraw;
        OpenToPayment = openToPayment;
        OpenToTransfer = openToTransfer;
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

    public void setOpenToWithdraw(boolean openToWithdraw) {
        OpenToWithdraw = openToWithdraw;
    }

    public void setOpenToPayment(boolean openToPayment) {
        OpenToPayment = openToPayment;
    }

    public void setOpenToTransfer(boolean openToTransfer) {
        OpenToTransfer = openToTransfer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", customer=" + customer +
                ", Para Çekebilir=" + OpenToWithdraw +
                ", Ödeme Yapabilir=" + OpenToPayment +
                ", Transfer Yapabilir=" + OpenToTransfer +
                '}';
    }
}
