package Behavioral.Memento.Example;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private Originator originator;
    private List<String> states;
    private int position;

    public Memento() {
        this.states = new ArrayList<>();
    }

    public void setOriginator(Originator originator){
        this.originator=originator;
    }

    public synchronized void save(){
        String state= originator.getState();
        System.out.println("Memento : saving state: "+state);
        states.add(state);
        position++;
    }

    public synchronized void undo(){
        int currentPosition=position;
        currentPosition-=2;
        String previousState=states.get(currentPosition);
        originator.setState(previousState);
        System.out.println("Memento undoing to: "+previousState);
    }
}
