package Structural.Composite.FileSystem;

public interface StorageContainer {
    void add(Storage storage);
    void delete(Storage storage);
    void list();
    void elements();
    void iterator();
}
