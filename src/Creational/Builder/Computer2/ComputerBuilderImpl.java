package Creational.Builder.Computer2;

public class ComputerBuilderImpl implements ComputerBuilder {
    private Computer computer;
    private static ComputerBuilderImpl builder=new ComputerBuilderImpl();
    //build işlemi bu sınıf içerisinde oluyor ve biz bu sınıfa ait builder static nesnemizi süreç içerisinde kullanıyoruz.

    private ComputerBuilderImpl(){
        //sınıf çağrısında computer yaratılır.
        computer=new Computer();
    }

    public static ComputerBuilderImpl  builder(){
        return builder;
    }

    /**
     * Ram yaratılır, computer'a set edilir. Bir sonraki işlemi gerçekleştirmek üzere yukarıda tanımlanan builder nesnesi
     * geriye döndürülür.
     * @return builder
     */
    @Override
    public ComputerBuilder buildRAM() {
        RAM ram=new RAM();
        computer.setRam(ram);
        return builder;
    }

    @Override
    public ComputerBuilder buildCPU() {
        CPU cpu=new CPU();
        computer.setCpu(cpu);
        return builder;
    }

    @Override
    public ComputerBuilder buildHDD() {
        HDD hdd=new HDD();
        computer.setHardDisk(hdd);
        return builder;
    }

    @Override
    public ComputerBuilder buildGraphicCard() {
        GraphicCard graphicCard=new GraphicCard();
        computer.setGraphicCard(graphicCard);
        return builder;
    }

    @Override
    public ComputerBuilder buildDisplay() {
        Display display=new Display();
        computer.setDisplay(display);
        return builder;
    }

    @Override
    public Computer buildComputer() {

        return computer;
    }
}
