package Behavioral.Observer.Publisher;

import java.util.ArrayList;
import java.util.List;

public class IndividualSubscriber implements Subscriber{
    private String name;
    private List<Publication> myPublications;

    public IndividualSubscriber(String name) {
        this.name = name;
        myPublications=new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receive(Publication publication) {
        myPublications.add(publication);
        read(publication);
    }

    private void read(Publication publication) {
        System.out.println(name + " is reading "+ publication.getName());
    }

    @Override
    public String toString() {
        return "IndividualSubscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}
