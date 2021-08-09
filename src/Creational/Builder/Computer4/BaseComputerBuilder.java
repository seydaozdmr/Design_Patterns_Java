package Creational.Builder.Computer4;

public interface BaseComputerBuilder {
    BaseComputerBuilder buildCPU();
    BaseComputerBuilder buildRAM();
    BaseComputerBuilder buildHDD();
    Computer buildDisplay();
}
