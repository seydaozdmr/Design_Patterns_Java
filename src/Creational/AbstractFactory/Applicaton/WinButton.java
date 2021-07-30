package Creational.AbstractFactory.Applicaton;

public class WinButton implements Button{
    @Override
    public void click() {
        System.out.println("win button clicked");
    }
}
