package Structural.Flyweight.Book;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Character> characters;
    private static Character endOfLine=new Character('\n',false);
    private int emptyPosition;
    private boolean full;
    private int numberOfCharacters=1;

    public Line(int numberOfCharacters) {
        this.numberOfCharacters = numberOfCharacters;
        this.characters=new ArrayList<>(numberOfCharacters);
    }

    public boolean add(Character character){
        if(!full){
            characters.add(character);
            character.setLine(this);
            character.setPosition(emptyPosition);
            emptyPosition++;
            if(emptyPosition==numberOfCharacters+1){
                full=true;
            }
            return true;
        }else {
            return false;
        }
    }

    public void addEndOfLine(){
        characters.add(endOfLine);
    }

    public List<Character> getChars(){
        return characters;
    }

    @Override
    public String toString() {
        StringBuilder bl=new StringBuilder();
        for(Character c:characters){
            bl.append(c.getValue());
        }
        return bl.toString();
    }
}
