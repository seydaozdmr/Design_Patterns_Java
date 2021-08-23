package Behavioral.Observer.Publisher;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Publisher publisher=new Publisher();
        Publication fourFourTwo= publisher.getFourFourTwo();

        Subscriber seyda=new IndividualSubscriber("Seyda");
        fourFourTwo.addSubscriber(seyda);

        publisher.publishFourFourTwo();
        fourFourTwo.listSubscribers();

    }
}
