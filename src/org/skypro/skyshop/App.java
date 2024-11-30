package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product product1 = new SimpleProduct("Молоко", 50);
        Product product2 = new DiscountedProduct("Телевизор", 30000, 10);
        Product product3 = new FixPriceProduct("Ноутбук");

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);

        basket.printBasket();

        System.out.println("Итого стоимость: " + basket.calculateTotalPrice());
    }
}
