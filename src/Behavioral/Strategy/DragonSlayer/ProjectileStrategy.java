package Behavioral.Strategy.DragonSlayer;

public class ProjectileStrategy implements DragonSlayerStrategy{
    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
