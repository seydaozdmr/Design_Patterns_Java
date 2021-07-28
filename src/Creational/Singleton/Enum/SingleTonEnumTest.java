package Creational.Singleton.Enum;

public class SingleTonEnumTest {
    public static void main(String[] args) {

        Runnable r1=()->{
            SingletonEnum singletonEnum=SingletonEnum.getInstance();
            singletonEnum.printName();
        };

        for(int i=0;i<1_000;i++){
            Thread thread=new Thread(r1);
            thread.start();
        }
    }
}
