package Creational.Singleton.Enum;

public enum SingletonEnum {
    SINGLETON;

    private String name;
    private int count;
    private SingletonEnum(){
        System.out.println("in singletonEnum");
        name="enum ->"+ count;
    }

    public static SingletonEnum getInstance(){
        return SINGLETON;
    }

    public void printName(){
        System.out.println(name);
    }
}
