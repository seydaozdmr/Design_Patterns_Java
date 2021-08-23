package Behavioral.Strategy.DragonSlayer;

public class Test {
    public static void main(String[] args) {
        DragonSlayerStrategy slayerStrategy=new ProjectileStrategy();
        DragonSlayer dragonSlayer=new DragonSlayer(slayerStrategy);
        dragonSlayer.gotoBattle();
    }
}
