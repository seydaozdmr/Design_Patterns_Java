package Behavioral.Command.EditorExample;

public class CutCommand extends Command{
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        saveBackup();
        application.clipboard=editor.getSelected();
        editor.deleteSelection();
        return true;
    }
}
