package Creational.Builder.Computer3;

public interface ComputerBuilder {
    //Tek bir buildComputer() methodu kullanıp ilgili nesnelerde interface implemente eden builder
    // sınıfında ayrı ayrı methodlar içerisinde gerçekleştirilebilir.

    ComputerBuilder buildRAM();
    ComputerBuilder buildCPU();
    ComputerBuilder buildHDD();
    ComputerBuilder buildGraphicCard();
    ComputerBuilder buildDisplay();
    Computer build();
}
