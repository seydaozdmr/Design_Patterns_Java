package Behavioral.State.DoorExample;

public class Door {
    private DoorState state;
    private DoorStateManager manager;

    public Door() {
        manager=new DoorStateManager(this);
        manager.closeDoor();
    }

    public void open(){
        state.open();
    }

    public void close(){
        state.close();
    }

    public boolean isOpen(){
        return state.isOpen();
    }

    public void changeState(DoorState state){
        this.state=state;
    }
}
