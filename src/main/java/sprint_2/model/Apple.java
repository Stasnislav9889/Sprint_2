package sprint_2.model;

import sprint_2.model.constants.Colour;
import sprint_2.model.constants.Discount;

public class Apple extends Food {

    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.RED)) {
            return Discount.DISCOUNT_60;
        } else return super.getDiscount();
    }
}