package Behavioral.Command.EditorExample;

public class Editor {
    private String text;

    public String getSelected(){
        return text;
    }

    public void deleteSelection(){
        this.text=null;
    }

    public void replaceSelection(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
