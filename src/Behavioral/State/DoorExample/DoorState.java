package Behavioral.State.DoorExample;

public interface DoorState {
    void close();
    boolean isOpen();
    void open();
}
