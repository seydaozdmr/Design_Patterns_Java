package Behavioral.Observer.Publisher;

public interface Subscriber {
    String getName();
    void receive(Publication publication);
}
