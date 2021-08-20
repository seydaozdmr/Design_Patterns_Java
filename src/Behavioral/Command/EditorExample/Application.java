package Behavioral.Command.EditorExample;

public class Application {
    protected String clipboard;
    private Editor [] editors;
    private Editor activeEditor;
    private CommandHistory history;


    public void copy(){
        Command command=new CopyCommand(this,activeEditor);
        executeCommand(command);
        Button button=new CopyButton();
        button.setCommand(command);
    }



    public void undo(){
        Command command= history.pop();
        if(command!=null){
            command.undo();
        }
    }

    private void executeCommand(Command command){
        if(command.execute()){
            history.push(command);
        }
    }
}
