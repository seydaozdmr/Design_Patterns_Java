package Creational.Builder.Computer2;

public class Test {
    public static void main(String[] args) {
        ComputerBuilder builder=ComputerBuilderImpl.builder();
        Computer computer= builder.buildCPU().buildHDD().buildComputer();

    }
}
