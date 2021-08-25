package Behavioral.Observer.WeatherChangeExample;

public class App {
    public static void main(String[] args) {
        Weather weather=new Weather();
        WeatherObserver orc=new Orcs();
        WeatherObserver hobbit1=new Hobbits();

        weather.addObserver(orc);
        weather.addObserver(hobbit1);

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();


    }
}
