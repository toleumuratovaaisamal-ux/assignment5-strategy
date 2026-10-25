public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String origin, String destination) {
        if (this.strategy == null) {
            throw new IllegalStateException("Route strategy is not set.");
        }
        this.strategy.buildRoute(origin, destination);
    }
}