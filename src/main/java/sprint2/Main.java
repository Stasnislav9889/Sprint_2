package sprint2;

import sprint2.model.Apple;
import sprint2.model.Food;
import sprint2.model.Meat;
import sprint2.model.constants.Colour;
import sprint2.service.ShoppingCart;

import static sprint2.model.constants.Amount.*;
import static sprint2.model.constants.Price.*;

public class Main {

    public static void main(String[] args) {
        Food meat = new Meat(amount_5, price_100);
        Food appleRed = new Apple(amount_10, price_50, Colour.RED);
        Food appleGreen = new Apple(amount_8, price_60, Colour.GREEN);
        Food[] listFood = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(listFood);
        System.out.println(shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getVegetarianTotalPriceWithoutDiscount());
    }
}