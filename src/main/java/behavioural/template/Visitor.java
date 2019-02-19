package behavioural.template;

public abstract class Visitor {

    private static final double COST = 9;

    public static double getCOST() {
        return COST;
    }

    public final double calculatePrice() {
        return baseRate()*discount();
    }

    public final double baseRate() {
        return COST;
    }

    public abstract double discount();

}
