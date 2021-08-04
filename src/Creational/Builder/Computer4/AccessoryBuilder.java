package Creational.Builder.Computer4;

public interface AccessoryBuilder {
    AccessoryBuilder buildKeyboard();
    AccessoryBuilder buildMouse();
    Computer build();

}
