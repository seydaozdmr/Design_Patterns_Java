package Creational.Singleton;

public class StaticBlockTest {
    public static void main(String[] args) {
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                StaticBlockSingleton singleton=StaticBlockSingleton.getInstance();
                singleton.printName();
            }
        };

        for(int i=0;i<10000;i++){
            Thread t1=new Thread(runnable);
            t1.run();
        }

//        Runnable r1=()->{
//          StaticBlockSingleton singleton=StaticBlockSingleton.getInstance();
//          singleton.printName();
//        };
    }
}
