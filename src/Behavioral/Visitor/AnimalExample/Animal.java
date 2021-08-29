package Behavioral.Visitor.AnimalExample;

public interface Animal {
    void accept(Feeder feeder);
    void eat();
}
