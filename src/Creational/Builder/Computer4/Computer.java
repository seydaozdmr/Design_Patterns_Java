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
        System.out.println("empty computer");
    }

    public Computer(CPU cpu, RAM ram, HDD hardDisk) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        System.out.println("computer object");
    }

    public Computer(Computer computer, GraphicCard graphicCard,Display display) {
        this.cpu = computer.getCpu();
        this.ram = computer.getRam();
        this.hardDisk = computer.getHardDisk();
        this.graphicCard = graphicCard;
        this.display=display;
    }


    public Computer(Computer computer, Keyboard keyboard, Mouse mouse) {
        this.cpu = computer.getCpu();
        this.ram = computer.getRam();
        this.hardDisk = computer.getHardDisk();
        this.graphicCard = computer.getGraphicCard();
        this.display = computer.getDisplay();
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
        private Keyboard keyboard;
        private Mouse mouse;
        private Computer computer;

        public AccessoryBuilderImpl(ComputerDisplayBuilderImpl computerDisplayBuilder) {
            computer = computerDisplayBuilder.computer;
            System.out.println("accessory computer created");
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
            computer.keyboard=keyboard;
            computer.mouse=mouse;
            return computer;
        }
    }

    private static class ComputerDisplayBuilderImpl implements ComputerDisplayBuilder{
        private GraphicCard graphicCard;
        private Display display;
        private Computer computer;

        public ComputerDisplayBuilderImpl(BaseComputerBuilderImpl baseComputerBuilderImpl) {
            computer=baseComputerBuilderImpl.computer;
            System.out.println("display computer created");
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
        public Computer buildAccessory() {
            computer.graphicCard=graphicCard;
            computer.display=display;
            return computer;
        }
    }

    private static class BaseComputerBuilderImpl implements BaseComputerBuilder{
        private CPU cpu;
        private RAM ram;
        private HDD hardDisk;
        public Computer computer;

        public BaseComputerBuilderImpl() {
            System.out.println("base computer created");
        }

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
        public Computer buildDisplay() {
            computer=new Computer(cpu,ram,hardDisk);
            return computer;
        }
    }
}
