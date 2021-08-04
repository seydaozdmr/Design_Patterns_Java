package Creational.Builder.Computer3;

public class Test {
    public static void main(String[] args) {
        ComputerBuilder builder=Computer.getBuilder();
        Computer computer=builder.buildCPU().build();
    }
}
