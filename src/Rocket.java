public class Rocket implements SpaceShip {

    public int cost;
    public int weight;
    public int maxWeight;

    public Rocket(int cost, int weight, int maxWeight){
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
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
