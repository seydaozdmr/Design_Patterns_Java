package Creational.Singleton;

public class ThreadedLazySingleton {
    private static String name;
    private static int count;
    private static volatile ThreadedLazySingleton threadedLazySingleton; //volatile ensures thread safe

    public ThreadedLazySingleton() {
        count++;
        this.name= "Threaded Lazy Singleton = "+count;
    }

    /**
     * If we don't use synchronized then multi threaded structures create more then one ThreadedLazySingleton
     * object.
     * @return threadLazySingleton object
     */
    public static synchronized ThreadedLazySingleton getInstance(){
        if(threadedLazySingleton==null){
            threadedLazySingleton=new ThreadedLazySingleton();
        }
        return threadedLazySingleton;
    }

    /**
     * synchronized block
     * @return
     */
    public static ThreadedLazySingleton getInstanceSynchronized(){
        synchronized (ThreadedLazySingleton.class){
            if(threadedLazySingleton==null){
                threadedLazySingleton=new ThreadedLazySingleton();
            }
        }
        return threadedLazySingleton;
    }

    /**
     * Double check locking pattern use 2 if check which one is not locked. So if object is initialized
     * we pass locked scope and have more performance.
     * @return
     */
    public static ThreadedLazySingleton doubleCheckLockingSingleton(){
        if(threadedLazySingleton==null){
            synchronized (ThreadedLazySingleton.class){
                if(threadedLazySingleton==null){
                    threadedLazySingleton=new ThreadedLazySingleton();
                }
            }
        }
        return threadedLazySingleton;
    }

    public void printName(){
        System.out.println(name);
    }
}
