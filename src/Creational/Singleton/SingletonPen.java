package Creational.Singleton;

public class SingletonPen {
    private String name;
    private static SingletonPen pen;

    private SingletonPen(String name) {
        System.out.println(name + "pen is created");
        this.name=name;
    }

    /***
     * Lazy Singleton :  Until you don't call getPen,Singleton pen doesn't initialize.
     * @param name
     * @return
     */
    public static SingletonPen getPen(String name){
        if(pen==null){
           pen=new SingletonPen(name);
        }
        return pen;
    }

    public void printName(){
        System.out.println(name);
    }
}
