package Behavioral.Iterator.FileSystem;


public abstract class StorageElement implements Storage {
    String name;
    Storage parent;
    boolean directory;

    public StorageElement(String name, Storage parent) {
        this.name = name;
        this.parent = parent;
        if(parent!=null){
            //eğer parent'ı yoksa bu bir dosyadır ve bir parent directory'sine bu storage element'i ekler
            ((Directory)parent).add(this);
        }
    }

    @Override
    public void rename(String name) {
        setName(name);
    }

    @Override
    public void save() {
        System.out.println("saving element");
    }

    @Override
    public void delete() {
        ((Directory)parent).delete(this);
    }

    @Override
    public void copy() {

    }

    @Override
    public void move(Directory target) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Storage getParent() {
        return parent;
    }

    public void setParent(Storage parent) {
        this.parent = parent;
    }

    public boolean isDirectory() {
        return directory;
    }

    public void setDirectory(boolean directory) {
        this.directory = directory;
    }
}
