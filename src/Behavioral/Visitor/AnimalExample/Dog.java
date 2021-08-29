package Behavioral.Visitor.AnimalExample;

public class Dog implements Animal{


    @Override
    public void accept(Feeder feeder) {
        feeder.feed(this);
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }
}
