package Creational.Builder.Computer;

public class ComputerBuilderImpl implements ComputerBuilder{
    private Computer computer;
    @Override
    public RAM buildRAM() {
        RAM ram=new RAM();
        computer.setRam(ram);
        return ram;
    }

    @Override
    public CPU buildCPU() {
        CPU cpu=new CPU();
        computer.setCpu(cpu);
        return cpu;
    }

    @Override
    public HDD buildHDD() {
        HDD hdd=new HDD();
        computer.setHardDisk(hdd);
        return hdd;
    }

    @Override
    public GraphicCard buildGraphicCard() {
        GraphicCard graphicCard=new GraphicCard();
        computer.setGraphicCard(graphicCard);
        return graphicCard;
    }

    @Override
    public Display buildDisplay() {
        Display display=new Display();
        computer.setDisplay(display);
        return display;
    }

    @Override
    public Computer buildComputer() {
        computer=new Computer();
        buildCPU();
        buildRAM();
        buildHDD();
        buildGraphicCard();
        buildDisplay();
        return computer;
    }
}
