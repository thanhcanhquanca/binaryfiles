package model;

public class PerchFish extends BigFish {
    private int weight;

    public PerchFish(int weight) {
        this.weight = weight;
    }

    public PerchFish(String id, String name, double price, int weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
