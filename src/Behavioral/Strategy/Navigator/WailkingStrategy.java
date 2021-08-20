package Behavioral.Strategy.Navigator;

public class WailkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(Point A, Point B) {
        System.out.println("wailking strategy");
    }
}
