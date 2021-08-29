package Behavioral.Visitor.AnimalExample;

public class App {
    public static void main(String[] args) {
        Feeder feeder = new Feeder();

        Animal cat=new Cat();

        cat.accept(feeder);

        Animal dog =new Dog();
        dog.accept(feeder);

    }
}
