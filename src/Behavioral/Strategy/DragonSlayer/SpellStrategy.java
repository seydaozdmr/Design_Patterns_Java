package Behavioral.Strategy.DragonSlayer;

public class SpellStrategy implements DragonSlayerStrategy{
    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
