package Creational.Builder.Car;

public class Test {
    public static void main(String[] args) {
        Builder builder=new CarBuilder();
        Director director=new Director();
        director.construcSportCar(builder);
        Car newCar=builder.build();
        System.out.println(newCar);
    }
}
