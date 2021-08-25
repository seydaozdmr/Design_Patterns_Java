package Behavioral.Observer.EditorExample;

import java.io.File;

public class Editor {
    protected EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager=new EventManager();
    }

    public void openFile(String path){
        this.file=new File(path);
        eventManager.notify("oper",file);
    }

    public void saveFile() throws Exception{
        if(this.file!=null){
            eventManager.notify("save",file);
        }else{
            throw new Exception("Please open a file first");
        }
    }
}
