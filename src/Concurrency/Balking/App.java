package Concurrency.Balking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        Car car=new Car();

        ExecutorService executorService= Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++){
            executorService.execute(car::runCar);
        }

        executorService.shutdown();

        try{
            if(!executorService.awaitTermination(10, TimeUnit.SECONDS))
                executorService.shutdown();
        }catch (InterruptedException e){
            System.out.println("ERROR : waiting on executor service shutdown!");
            Thread.currentThread().interrupt();
        }
    }
}
