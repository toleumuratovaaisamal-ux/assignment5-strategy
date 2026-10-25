public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building transit route (bus/subway schedules) from " + origin + " to " + destination + ".");
    }
}