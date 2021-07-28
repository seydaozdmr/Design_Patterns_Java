package Creational.Singleton;

public class StaticInnerSingleton {
    private static int count;
    private String name;

    private StaticInnerSingleton(){
        name="Static Inner Singleton ->"+count;
        count++;
    }

    private static class SingletonHelper{
        private static final StaticInnerSingleton INSTANCE=new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance(){
        return  SingletonHelper.INSTANCE;
    }

    public void printName(){
        System.out.println(name);
    }
}
