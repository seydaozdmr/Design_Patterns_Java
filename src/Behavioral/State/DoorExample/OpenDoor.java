package Behavioral.State.DoorExample;

public class OpenDoor extends AbstractDoor{
    public OpenDoor(DoorStateManager manager) {
        super(true, manager);
    }

    @Override
    public void close() {
            manager.closeDoor();
    }

    @Override
    public void open() {
        System.out.println("door is already opened");
    }
}
