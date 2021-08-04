package Creational.Builder.Computer2;

public interface ComputerBuilder {
    /**
     * Bu interface inşa sürecinde sürekli kendini döndürür ve sonuç olarak bilgisayar yaratılır.
     * @return
     */
    ComputerBuilder buildRAM();
    ComputerBuilder buildCPU();
    ComputerBuilder buildHDD();
    ComputerBuilder buildGraphicCard();
    ComputerBuilder buildDisplay();
    Computer buildComputer();
}
