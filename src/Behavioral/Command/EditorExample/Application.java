package Behavioral.Command.EditorExample;

public class Application {
    /**
     * Command is a behavioral design pattern that turns a request into a stand-alone object
     * that contains all information about the request.
     * This transformation lets you pass requests as a method arguments,
     * delay or queue a request’s execution, and support undoable operations.
     */
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
