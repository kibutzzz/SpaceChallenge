public class Rocket implements SpaceShip {

    public int cost;
    public int weight;
    public int maxCargoWeight;
    public int cargoWeight;

    public Rocket(int cost, int weight, int maxWeight){
        this.cost = cost;
        this.weight = weight;
        this.maxCargoWeight = maxWeight - weight;
        this.cargoWeight = 0;
    }

    @Override
    public boolean lauch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}
