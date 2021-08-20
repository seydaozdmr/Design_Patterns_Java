package Behavioral.Command.EditorExample;

public class UndoCommand extends Command{
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        application.undo();
        return false;
    }
}
