package Behavioral.Observer.Publisher;

import java.util.Date;

public class Publisher {
    private Publication fourFourTwo;

    public Publisher() {
        this.fourFourTwo = new FourFourTwo("FourFourTwo");
    }

    public void publishFourFourTwo() throws InterruptedException {
        System.out.println("New FourFourTwo on the way");
        Runnable runnable=()->{
            while(true){
                Date date=new Date();
                fourFourTwo.publish(date.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread=new Thread(runnable);

        thread.start();

        thread.join(10000);

    }

    public Publication getFourFourTwo(){
        return fourFourTwo;
    }
}
