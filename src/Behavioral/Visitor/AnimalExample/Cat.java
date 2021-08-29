package Behavioral.Visitor.AnimalExample;

public class Cat implements Animal{


    @Override
    public void accept(Feeder feeder) {
        feeder.feed(this);
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }
}
