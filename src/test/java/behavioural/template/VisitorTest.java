package behavioural.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorTest {

    @Test
    void standardEntryShouldChargeFullPrice() {
        Visitor standard = new StandardEntry();
        double calculatedPrice = standard.calculatePrice();
        assertEquals(calculatedPrice, 9);
    }


    @Test
    void youngPersonShouldApplyDiscount() {
        YoungPerson youngPerson = new YoungPerson();
        double calculatedPrice = youngPerson.calculatePrice();
        double expectedPrice = 9 * (1 - youngPerson.getDiscountPercentage());
        assertEquals(calculatedPrice, expectedPrice);
    }

}