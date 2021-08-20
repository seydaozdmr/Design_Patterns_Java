package Behavioral.Strategy.Navigator;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute(Point A, Point B) {
        System.out.println("public transport strategy");
    }
}
