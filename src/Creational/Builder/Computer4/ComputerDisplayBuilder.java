package Creational.Builder.Computer4;

public interface ComputerDisplayBuilder {
    ComputerDisplayBuilder buildGraphicCard();
    ComputerDisplayBuilder buildDisplay();
    Computer buildAccessory();

}
