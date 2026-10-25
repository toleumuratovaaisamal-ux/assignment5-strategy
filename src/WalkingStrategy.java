public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building pedestrian walking route (using sidewalks/trails) from " + origin + " to " + destination + ".");
    }
}