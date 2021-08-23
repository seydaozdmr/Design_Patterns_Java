package Behavioral.Command.EditorExample;

public class CopyCommand extends Command{

    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    /**
     * Copy command application clipboard'ına editörde seçtiğimiz yazıyı kopyalamamıza yarıyor.
     * Base class'ında application ve editor alanları bulunuyor command'ı uygulamak için bu alanları
     * sınıfa geçmemiz gerekiyor.
     * @return
     */
    @Override
    boolean execute() {
        application.clipboard=editor.getSelected();
        return false;
    }
}
