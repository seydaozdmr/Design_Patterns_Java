package Creational.Prototype.Account;

public class Test {
    public static void main(String[] args) {
        //Bir prototype Account nesnesi oluşturuyorum
        Account normalAccount=new Account(1,1000,true,true,true); //normal durumdaki account bütün işlemleri gerçekleştirebilir.

        Account negativeDefaultAccount=normalAccount.clone();
        negativeDefaultAccount.setOpenToPayment(false);
        negativeDefaultAccount.setOpenToTransfer(false);
        negativeDefaultAccount.setOpenToWithdraw(true); //negative durumdaki account yalnızca para çekebilir.

        Account frozenDefaultAccount=normalAccount.clone();
        frozenDefaultAccount.setOpenToWithdraw(false);
        frozenDefaultAccount.setOpenToTransfer(false);
        frozenDefaultAccount.setOpenToPayment(false); //frozen durumdaki account hiç bir işlem yapamaz




    }
}
