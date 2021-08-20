package Behavioral.Iterator.FileSystem;

import java.util.List;
import java.util.Iterator;

public class DirectoryIterator<Storage> implements Iterator<Storage>{
    private Directory directory;
    private List<Storage> elements;
    private Iterator<Storage> iterator;

    public DirectoryIterator(Directory directory) {
        this.directory = directory;
        this.elements = (List<Storage>) directory.elements();
        this.iterator = elements.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Storage next() {
        return iterator.next();
    }


}
