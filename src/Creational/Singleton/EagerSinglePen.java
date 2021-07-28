package Creational.Singleton;

public class EagerSinglePen {
    private String penName;
    private static int count;

    private static EagerSinglePen myPen=new EagerSinglePen();

    public EagerSinglePen() {
        count++;
        penName="Singleton" + count;
    }

    public static EagerSinglePen getInstance(){
        return myPen;
    }

    public void printName(){
        System.out.println(penName);
    }


}
