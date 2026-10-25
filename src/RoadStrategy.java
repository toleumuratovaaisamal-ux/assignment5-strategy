public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building fastest driving route by road from " + origin + " to " + destination + ".");
    }
}