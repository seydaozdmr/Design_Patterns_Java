package Behavioral.Observer.WeatherChangeExample;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;

    public Weather() {
        this.observers=new ArrayList<>();
        this.currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver weatherObserver){
        this.observers.add(weatherObserver);
    }

    public void deleteObserver(WeatherObserver weatherObserver){
        this.observers.removeIf(elem->elem==weatherObserver);
    }

    public void timePasses(){
        WeatherType [] weatherTypes=WeatherType.values();
        currentWeather=weatherTypes[(currentWeather.ordinal()+1)%weatherTypes.length];
        System.out.println("The weather changed to :"+currentWeather.getDescription());
        notifyObservers();

    }

    private void notifyObservers() {
        for(WeatherObserver observer:observers){
            observer.update(currentWeather);
        }
    }
}
