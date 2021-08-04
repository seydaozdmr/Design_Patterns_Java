package Creational.Builder.Computer;

public interface ComputerBuilder {
    //Tek bir buildComputer() methodu kullanıp ilgili nesnelerde interface implemente eden builder
    // sınıfında ayrı ayrı methodlar içerisinde gerçekleştirilebilir.

    RAM buildRAM();
    CPU buildCPU();
    HDD buildHDD();
    GraphicCard buildGraphicCard();
    Display buildDisplay();
    Computer buildComputer();
}
