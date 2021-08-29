package Behavioral.State.Person;

public class Person {
    private EmotionalState emotionalState;

    public Person() {
        this.emotionalState = new HappyState();
    }

    public void setEmotionalState (EmotionalState emotionalState){
        this.emotionalState=emotionalState;
    }

    public void sayHallo(){
        emotionalState.sayHallo();
    }

    public void sayGoodbye(){
        emotionalState.sayGoodbye();
    }
}
