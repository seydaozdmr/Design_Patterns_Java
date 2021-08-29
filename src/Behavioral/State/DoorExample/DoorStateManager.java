package Behavioral.State.DoorExample;

public class DoorStateManager {
    private Door door;
    protected DoorState closeDoor;
    protected DoorState openDoor;

    public DoorStateManager(Door door) {
        this.door = door;
        closeDoor=new CloseDoor(this);
        openDoor=new OpenDoor(this);
    }

    void changeState(DoorState state){
        door.changeState(state);
    }

    void closeDoor(){
        changeState(closeDoor);
    }

    void openDoor(){
        changeState(openDoor);
    }
}
