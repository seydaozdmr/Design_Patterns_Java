package Creational.Singleton;

public class Test {
    /**
     *
     * @param args
     * Intent: Ensure a class only has one instance, and provide a global point of access to it;
     */
    public static void main(String[] args) {
        SingletonPen myPen=SingletonPen.getPen("dolma");
        myPen.printName();
        SingletonPen myNewPen=SingletonPen.getPen("kurşun");
        myPen.printName();


        EagerSinglePen eagerSinglePen=EagerSinglePen.getInstance();
        eagerSinglePen.printName();
    }
}
