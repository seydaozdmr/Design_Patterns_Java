package Creational.Singleton;

public class StaticInnerSingletonTest {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                    StaticInnerSingleton singleton=StaticInnerSingleton.getInstance();
                    singleton.printName();

            }
        };
        for(int i=0;i<100;i++){
            Thread t1=new Thread(runnable);
            t1.start();
        }

    }
}
