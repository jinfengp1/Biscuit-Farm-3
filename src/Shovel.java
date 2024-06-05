public class Shovel extends Item {

    public double multiplier;

    public Shovel(String name, String description, int cost, double mult) {
        super(name,cost,description);
        multiplier = mult;
    }
}
