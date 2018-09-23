public class U2 extends Rocket {

    public U2(int cost, int weight, int maxWeight) {
        super(cost, weight, maxWeight);
    }

    @Override
    public boolean launch() {
        return 0.04 * (cargoWeight/maxCargoWeight) > Math.random();
    }

    @Override
    public boolean land() {
        return 0.08 * (cargoWeight/maxCargoWeight) > Math.random();
    }
}
