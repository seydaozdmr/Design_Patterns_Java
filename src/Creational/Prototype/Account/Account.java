package Creational.Prototype.Account;

public class Account implements Cloneable{
    private int iban;
    private double balance;
    private boolean OpenToWithdraw;
    private boolean OpenToPayment;
    private boolean OpenToTransfer;

    public Account(int iban,double balance, boolean openToWithdraw, boolean openToPayment, boolean openToTransfer) {
        this.iban = iban;
        this.balance=balance;
        OpenToWithdraw = openToWithdraw;
        OpenToPayment = openToPayment;
        OpenToTransfer = openToTransfer;
    }

    @Override
    protected Account clone() {
        Account account=null;
        try{
            account=(Account) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Problem when cloning the object: "+e.getMessage());
            e.printStackTrace();
        }
        return account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIban(int iban) {
        this.iban = iban;
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
}
