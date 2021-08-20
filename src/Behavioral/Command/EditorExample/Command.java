package Behavioral.Command.EditorExample;

public abstract class Command {
    protected Application application;
    protected Editor editor;
    protected String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    void saveBackup(){
        backup=editor.getText();

    }
     void undo(){
        editor.setText(backup);
     }

     //returns true or false depending on whether the command changes the editor's state
     abstract boolean execute();
}
