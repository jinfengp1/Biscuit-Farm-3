public class Biscuit extends Item {

    int growTime;
    int sellCost;


    public Biscuit(String name, String description, int cost, int sellCost, int growTime) {
        super(name,cost,description);

        this.growTime = growTime;
        this.sellCost = sellCost;

    }




}
