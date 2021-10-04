package Structural.Decorator.ToastExample;

public class Test {

    public static void main(String[] args) {
        Toastable myToast=new ToastBread("Ayvalık",10);
        myToast= new Topping("Salamlı",myToast,3);
        System.out.println(myToast.calculatePrice());
    }
}
