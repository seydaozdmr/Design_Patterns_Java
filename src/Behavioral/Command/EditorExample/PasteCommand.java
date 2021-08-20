package Behavioral.Command.EditorExample;

public class PasteCommand extends Command{
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        saveBackup();
        editor.replaceSelection(application.clipboard);
        return true;
    }
}
