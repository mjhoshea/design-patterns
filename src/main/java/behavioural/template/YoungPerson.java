package behavioural.template;

public class YoungPerson extends Visitor {

    private static double discountPercentate = 0.2;

    double getDiscountPercentage() {
        return discountPercentate;
    }

    public double discount() {
        return 1 - discountPercentate;
    }
}
