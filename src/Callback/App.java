package Callback;

public class App {
    public static void main(String[] args) {
        Task task=new SimbleTask();
        task.executeWith(()->System.out.println("burası callback methodunun yapacağı iş..."));
    }
}
