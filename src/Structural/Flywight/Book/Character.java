package Structural.Flywight.Book;

public class Character {
    //Intrinsic Properties
    private char value;
    private boolean upperCase;

    //Extrinsic Properties
    private Line line;
    private int position;

    public Character(char value, boolean upperCase) {
        this.value = value;
        this.upperCase = upperCase;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isUpperCase() {
        return upperCase;
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
