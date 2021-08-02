package Creational.Prototype;

public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.setPartTime(true);

        Prototype anotherWorker=worker.clone();
        System.out.println(anotherWorker);
    }
}
