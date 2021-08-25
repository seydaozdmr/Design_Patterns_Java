package Behavioral.Observer.WeatherChangeExample;

public class Hobbits implements WeatherObserver{
    @Override
    public void update(WeatherType currentWather) {
        System.out.println("The hobbits are facing "+currentWather.getDescription()+ " weather now");
    }
}
