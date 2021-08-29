package Behavioral.State.Person;

public class SadState implements EmotionalState {

    @Override
    public void sayHallo() {
        System.out.println("hi i'm sad.");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("goodbye i'm sad");
    }
}
