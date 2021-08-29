package Behavioral.Visitor.AnimalExample;

public class Feeder {

    void feed(Cat cat){
        cat.eat();
    }

    void feed(Dog dog){
        dog.eat();
    }
}
