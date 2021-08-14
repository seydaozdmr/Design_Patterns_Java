package Structural.Composite.FileSystem;

public interface Storage {
    void rename(String name);
    void save();
    void delete();
    void copy();
    void move(Directory target);
}
