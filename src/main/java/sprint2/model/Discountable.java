package sprint2.model;

public interface Discountable {

    default double getDiscount() {
        return 0;
    }
}