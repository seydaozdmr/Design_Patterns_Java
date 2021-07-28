package Creational.Singleton;

public class ThreadedLazySingletonClient {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Runnable runnable=new Runnable() {
                @Override
                public void run() {
                    ThreadedLazySingleton singleton=ThreadedLazySingleton.getInstance();
                    singleton.printName();
                }
            };
            Thread thread=new Thread(runnable,"Thread-"+i);
            System.out.print(thread.getName()+ " -> ");
            thread.start();
        }
    }
}
