package Behavioral.Strategy.Navigator;

public class RoadStrategy implements RouteStrategy{
    @Override
    public void buildRoute(Point A,Point B) {
        System.out.println("road strategy");
    }
}
