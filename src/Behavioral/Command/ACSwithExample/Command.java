package Behavioral.Command.ACSwithExample;

public interface Command {
    //command method
    void execute(Temperature temperature);

    void undo();
    void redo();
}
