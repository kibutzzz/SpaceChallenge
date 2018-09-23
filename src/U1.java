public class U1 extends Rocket {

    public U1(int cost, int weight, int maxWeight) {
        super(cost, weight, maxWeight);
    }

    @Override
    public boolean launch() {
        return 0.05 * (cargoWeight/maxCargoWeight) > Math.random();
    }

    @Override
    public boolean land() {
        return 0.01 * (cargoWeight/maxCargoWeight)> Math.random();
    }
}
