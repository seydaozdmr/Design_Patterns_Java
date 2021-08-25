package Behavioral.Observer.WeatherChangeExample;

public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType currentWather) {
        System.out.println("The orcs are facing "+currentWather.getDescription()+ " weather now");
    }
}
