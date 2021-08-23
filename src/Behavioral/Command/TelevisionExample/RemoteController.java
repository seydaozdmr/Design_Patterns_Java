package Behavioral.Command.TelevisionExample;

import java.util.Deque;
import java.util.LinkedList;

public class RemoteController {
    private final Deque<Runnable> undoStack=new LinkedList<>();
    private final Deque<Runnable> redoStack=new LinkedList<>();

    public RemoteController() {
    }

    public void pressButton(Runnable runnable){
        runnable.run();
        undoStack.offerLast(runnable);
    }

    public void undoLastPress(){
        if (!undoStack.isEmpty()){
            Runnable previousPress=undoStack.pollLast();
            redoStack.offerLast(previousPress);
            previousPress.run();
        }
    }

    public void redoLastPress(){
        if(!redoStack.isEmpty()){
            Runnable previousPress=redoStack.pollLast();
            undoStack.offerLast(previousPress);
            previousPress.run();
        }
    }

    @Override
    public String toString() {
        return "RemoteController{}";
    }
}


