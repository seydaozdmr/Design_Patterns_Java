package Behavioral.Observer.Publisher;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractPublication implements Publication{
    protected String name;
    protected List<Subscriber> subscribers;

    public AbstractPublication(String name) {
        this.name = name;
        this.subscribers=new ArrayList<>();
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.removeIf(elem->elem==subscriber);
    }

    @Override
    public void publish(String date) {
        String tempName=name;
        name= name + " ~ "+date;
        Iterator<Subscriber> iterator=subscribers.iterator();
        while(iterator.hasNext()){
            Subscriber subscriber=iterator.next();
            subscriber.receive(this);
        }
        name = tempName;

        //subscribers.stream().forEach(p->p.receive(this));

    }

    @Override
    public void listSubscribers() {
        subscribers.stream().forEach(System.out::println);
    }
}
