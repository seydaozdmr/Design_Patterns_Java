package Behavioral.Command.EditorExample;

import java.util.List;
import java.util.Stack;

public class CommandHistory {
    private Stack<Command>  commands;

    public CommandHistory() {
        this.commands = new Stack<>();
    }

    public void push(Command command){
        commands.push(command);
    }

    public Command pop(){
        return commands.pop();
    }
}
