package Behavioral.State.Person;

public class HappyState implements EmotionalState{
    @Override
    public void sayHallo() {
        System.out.println("hi i'm happy");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("goodbye i'm happy");
    }
}
