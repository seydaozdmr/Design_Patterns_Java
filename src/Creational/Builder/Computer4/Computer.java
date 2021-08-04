package Creational.Builder.Computer4;

public class Computer {
    private static BaseComputerBuilderImpl baseComputerBuilder;
    private static ComputerDisplayBuilderImpl computerDisplayBuilder;
    private static AccessoryBuilderImpl accessoryBuilder;

    private CPU cpu;
    private RAM ram;
    private HDD hardDisk;
    private GraphicCard graphicCard;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer() {
    }

    public Computer(CPU cpu, RAM ram, HDD hardDisk) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
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




    public static BaseComputerBuilder getBaseBuilder(){
        baseComputerBuilder=new BaseComputerBuilderImpl();
        return baseComputerBuilder;
    }

    public static ComputerDisplayBuilder getDisplayBuilder(){
        computerDisplayBuilder =new ComputerDisplayBuilderImpl(baseComputerBuilder);
        return computerDisplayBuilder;
    }

    public static AccessoryBuilder getAccessoryBuilder(){
        accessoryBuilder= new AccessoryBuilderImpl(computerDisplayBuilder);
        return accessoryBuilder;
    }

    private static class AccessoryBuilderImpl implements AccessoryBuilder{
        private ComputerDisplayBuilder computerDisplayBuilder;
        private Keyboard keyboard;
        private Mouse mouse;

        public AccessoryBuilderImpl(ComputerDisplayBuilder computerDisplayBuilder) {
            this.computerDisplayBuilder = computerDisplayBuilder;
        }


        @Override
        public AccessoryBuilder buildKeyboard() {
            this.keyboard=new Keyboard();
            return this;
        }

        @Override
        public AccessoryBuilder buildMouse() {
            this.mouse=new Mouse();
            return this;
        }

        @Override
        public Computer build() {
            return null;
        }
    }

    private static class ComputerDisplayBuilderImpl implements ComputerDisplayBuilder{
        private BaseComputerBuilder baseComputerBuilder;
        private GraphicCard graphicCard;
        private Display display;

        public ComputerDisplayBuilderImpl(BaseComputerBuilder baseComputerBuilder) {
            this.baseComputerBuilder = baseComputerBuilder;
        }

        @Override
        public ComputerDisplayBuilder buildGraphicCard() {
            this.graphicCard=new GraphicCard();
            return this;
        }

        @Override
        public ComputerDisplayBuilder buildDisplay() {
            this.display=new Display();
            return this;
        }

        @Override
        public Computer build() {

            return ;
        }
    }

    private static class BaseComputerBuilderImpl implements BaseComputerBuilder{
        private CPU cpu;
        private RAM ram;
        private HDD hardDisk;
        private Computer computer;

        @Override
        public BaseComputerBuilder buildCPU() {
            this.cpu=new CPU();
            return this;
        }

        @Override
        public BaseComputerBuilder buildRAM() {
            this.ram=new RAM();
            return this;
        }

        @Override
        public BaseComputerBuilder buildHDD() {
            this.hardDisk=new HDD();
            return this;
        }

        @Override
        public Computer buildBaseComputer() {
            computer= new Computer(cpu,ram,hardDisk);
            return computer;
        }
    }
}
