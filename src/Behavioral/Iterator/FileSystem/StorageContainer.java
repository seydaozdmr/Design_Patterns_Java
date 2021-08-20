package Behavioral.Iterator.FileSystem;

import java.util.List;
import java.util.Iterator;
public interface StorageContainer {
    void add(Storage storage);
    void delete(Storage storage);
    void list();
    List<Storage> elements();
    Iterator<Storage> iterator();
}
