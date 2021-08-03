package Creational.Prototype.AccountEntityFactory;

import Creational.Prototype.AccountAbstractFactory.Customer;

public class Account implements Cloneable{
    private int id;
    private double balance;
    private Customer customer;
    private boolean OpenToWithdraw;
    private boolean OpenToPayment;
    private boolean OpenToTransfer;

    //Prototypes
    private static Account prototype=new Account(1,1000,true,true,true);
    private static Account frozenAccount=new Account(1,1000,false,false,false);
    private static Account negativeAccount=new Account(1,1000,true,true,false);



    private Account(int id, double balance, boolean openToWithdraw, boolean openToPayment, boolean openToTransfer) {
        this.id = id;
        this.balance = balance;
        OpenToWithdraw = openToWithdraw;
        OpenToPayment = openToPayment;
        OpenToTransfer = openToTransfer;
    }

    public static Account getNormalAccount(Customer customer){
        Account account= prototype;
        account.setCustomer(customer);
        return account;
    }

    public static Account getFrozenAccount(Customer customer){
        Account account=frozenAccount;
        account.setCustomer(customer);
        return account;
    }

    public static Account getNegativeAccount(Customer customer){
        Account account=negativeAccount;
        account.setCustomer(customer);
        return account;
    }

    @Override
    protected Creational.Prototype.AccountAbstractFactory.Account clone()  {
        Creational.Prototype.AccountAbstractFactory.Account account=null;
        try {
            account= (Creational.Prototype.AccountAbstractFactory.Account) super.clone();
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
