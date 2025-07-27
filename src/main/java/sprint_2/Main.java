package sprint_2;

import sprint_2.model.Apple;
import sprint_2.model.Food;
import sprint_2.model.Meat;
import sprint_2.service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, "red");
        Food appleGreen = new Apple(8, 60, "green");
        Food[] listFood = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(listFood);
        System.out.println(shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getVegetarianTotalPriceWithoutDiscount());
    }
}