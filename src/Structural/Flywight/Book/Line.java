package Structural.Flywight.Book;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Character> characters;
    private static Character endOfLine=new Character('\n',false);
    private int emptyPosition;
    private boolean full;
    private int numberOfCharacters=1;

    public Line(int emptyPosition) {
        this.emptyPosition = emptyPosition;
        this.characters=new ArrayList<>(numberOfCharacters);
    }

    public boolean add(Character character){
        return characters.add(character);
    }

    public void addEndOfLine(){

    }

    public List<Character> getChars(){
        return characters;
    }
}
