package Creational.Builder.Computer3;

public class Computer {
    /**
     * Bu sınıf inner ComputerBuilderImpl sınıfına sahiptir ve bu sınıfa ait nesneyi static olarak getBuilder methodu ile
     * dışa açarız. Bu sayede yarattığımız nesne immutable olur. Set methodlarından kurtuluruz.
     */
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

    public RAM getRam() {
        return ram;
    }

    public HDD getHardDisk() {
        return hardDisk;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }


    public static ComputerBuilder getBuilder(){
        return new ComputerBuilderImpl();
    }

    private static class ComputerBuilderImpl implements ComputerBuilder{

        private CPU cpu;
        private RAM ram;
        private HDD hardDisk;
        private GraphicCard graphicCard;
        private Display display;
        private Keyboard keyboard;
        private Mouse mouse;

        @Override
        public ComputerBuilder buildRAM() {
            RAM ram=new RAM();
            this.ram=ram;
            return this;
        }

        @Override
        public ComputerBuilder buildCPU() {
            this.cpu=new CPU();
            return this;
        }

        @Override
        public ComputerBuilder buildHDD() {
            this.hardDisk=new HDD();
            return this;
        }

        @Override
        public ComputerBuilder buildGraphicCard() {
            this.graphicCard=new GraphicCard();
            return this;
        }

        @Override
        public ComputerBuilder buildDisplay() {
            this.display=new Display();
            return this;
        }

        @Override
        public Computer build() {
            //yaratma işlemini constructor üzerinden gerçekleştiririz.
            return new Computer(cpu,ram,hardDisk,graphicCard,display);
        }
    }
}
