package Behavioral.Command.EditorExample;

public class CopyCommand extends Command{

    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        application.clipboard=editor.getSelected();
        return false;
    }
}
