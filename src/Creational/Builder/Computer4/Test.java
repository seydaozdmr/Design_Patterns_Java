package Creational.Builder.Computer4;

public class Test {
    public static void main(String[] args) {

        Computer computer= Computer.getBaseBuilder().buildDisplay().getDisplayBuilder().buildAccessory().getAccessoryBuilder().build();
        System.out.println("*****");
        Computer myComputer=computer.getBaseBuilder().buildCPU().buildRAM().buildHDD().buildDisplay();
        System.out.println("*****");
        Computer computerWithDisplay=myComputer.getDisplayBuilder().buildGraphicCard().buildDisplay().buildAccessory();
        System.out.println("*****");
        Computer computerWithAccessory=computerWithDisplay.getAccessoryBuilder().build();


    }
}
