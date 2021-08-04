package Creational.Builder.Computer2;

public class Computer {

    private CPU cpu;
    private RAM ram;
    private HDD hardDisk;
    private GraphicCard graphicCard;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer() {
    }

    public Computer(CPU cpu, RAM ram, HDD hardDisk, GraphicCard graphicCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.graphicCard = graphicCard;
    }

    public Computer(CPU cpu, RAM ram, HDD hardDisk, GraphicCard graphicCard, Display display) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.graphicCard = graphicCard;
        this.display = display;
    }

    public Computer(CPU cpu, RAM ram, HDD hardDisk, GraphicCard graphicCard, Display display, Keyboard keyboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
    }

    public Computer(CPU cpu, RAM ram, HDD hardDisk, GraphicCard graphicCard, Display display, Keyboard keyboard, Mouse mouse) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HDD hardDisk) {
        this.hardDisk = hardDisk;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
