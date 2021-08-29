package Behavioral.State.DoorExample;

public class CloseDoor extends AbstractDoor{
    public CloseDoor(DoorStateManager manager) {
        super(false, manager);
    }

    @Override
    public void close() {
        System.out.println("door is already closed.");
    }

    @Override
    public void open() {
        manager.openDoor();
    }
}
