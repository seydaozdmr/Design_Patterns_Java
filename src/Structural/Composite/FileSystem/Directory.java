package Structural.Composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends StorageElement implements StorageContainer{
    List<Storage> myStorage=new ArrayList<>();
    public Directory(String name) {
        super(name, null);
        directory=true;
    }

    public Directory(String name, Storage parent) {
        super(name, parent);
        directory=true;
    }

    @Override
    public void delete(Storage storage) {
        myStorage.removeIf(elem->elem==storage);
    }

    @Override
    public void add(Storage storage) {
        myStorage.add(storage);
    }

    @Override
    public void list() {

    }

    @Override
    public void elements() {

    }

    @Override
    public void iterator() {

    }
}
