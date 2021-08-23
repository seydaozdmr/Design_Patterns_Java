package Behavioral.Strategy.DragonSlayer;

public class DragonSlayer {
    private DragonSlayerStrategy dragonSlayerStrategy;

    public DragonSlayer(DragonSlayerStrategy dragonSlayerStrategy) {
        this.dragonSlayerStrategy = dragonSlayerStrategy;
    }

    public void changeStrategy(DragonSlayerStrategy slayerStrategy){
        this.dragonSlayerStrategy=slayerStrategy;
    }

    public void gotoBattle(){
        dragonSlayerStrategy.execute();
    }
}
