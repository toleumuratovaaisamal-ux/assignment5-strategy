public class Main {
    public static void main(String[] args) {
        String origin = "Astana IT University";
        String destination = "Khan Shatyr";

        Navigator navigator = new Navigator(new RoadStrategy());
        System.out.println("--- Driving Mode ---");
        navigator.buildRoute(origin, destination);

        System.out.println("\n--- Switching to Walking Mode ---");
        navigator.setStrategy(new WalkingStrategy());
        navigator.buildRoute(origin, destination);

        System.out.println("\n--- Switching to Public Transport Mode ---");
        navigator.setStrategy(new PublicTransportStrategy());
        navigator.buildRoute(origin, destination);
    }
}