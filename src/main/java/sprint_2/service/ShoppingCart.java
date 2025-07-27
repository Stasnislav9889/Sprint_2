package sprint_2.service;

import sprint_2.model.Food;

public class ShoppingCart {
    Food[] listFood;

    public ShoppingCart(Food[] listFood) {
        this.listFood = listFood;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food food : listFood) {
            totalPrice += food.getAmount() * food.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food food : listFood) {
            if (food.getDiscount() > 0) {
                totalPrice += food.getAmount() * (food.getPrice() - food.getPrice() * food.getDiscount()/100);
            } else {
                totalPrice += food.getAmount() * food.getPrice();
            }
        }
        return totalPrice;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food food : listFood) {
            if (food.isVegetarian()) {
                totalPrice += food.getAmount() * food.getPrice();
            }
        }
        return totalPrice;
    }
}