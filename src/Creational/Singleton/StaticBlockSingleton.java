package Creational.Singleton;

public class StaticBlockSingleton {
    private static int count;
    private String name;
    private static StaticBlockSingleton singleton;

    static{
        singleton=new StaticBlockSingleton();
    }
    private StaticBlockSingleton() {
        name="Static block singleton -> "+count;
    }

    public static StaticBlockSingleton getInstance(){
        if(singleton==null){
            singleton=new StaticBlockSingleton();
        }
        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }




}
