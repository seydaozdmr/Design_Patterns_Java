package Behavioral.Command.EditorExample;

public abstract class Button {
    Command command;

    public Button() {
    }

    public void setCommand(Command command){
        this.command=command;
    }
}
