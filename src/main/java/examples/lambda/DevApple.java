package examples.lambda;

public class DevApple {

    int weight;

    public DevApple() {
    }

    public DevApple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
