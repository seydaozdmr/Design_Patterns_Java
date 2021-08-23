package Behavioral.Strategy.DragonSlayer;

public class MeleeStrategy implements DragonSlayerStrategy{
    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
