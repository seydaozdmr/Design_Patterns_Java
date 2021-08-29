package Behavioral.State.DoorExample;

public class AbstractDoor implements DoorState{
    private boolean open;
    protected DoorStateManager manager;


    public AbstractDoor(boolean open,DoorStateManager manager){
        this.manager=manager;
        this.open=open;
    }

    @Override
    public void close() {

    }

    @Override
    public boolean isOpen() {
        return this.open;
    }

    @Override
    public void open() {

    }
}
