package Behavioral.Observer.Publisher;

public interface Publication {
    String getName();
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void publish(String date);
    void listSubscribers();

}
