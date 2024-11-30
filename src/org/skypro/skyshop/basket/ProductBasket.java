package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product) {
        if (count >= products.length) {
            System.out.println("Невозможно добавить продукт.");
            return;
        }
        products[count++] = product;
    }

    public int calculateTotalPrice() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        int specialCount = 0;
        int totalPrice = 0;

        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
                totalPrice += product.getPrice();
                if (product.isSpecial()) {
                    specialCount++;
                }
            }
        }

        if (count == 0) {
            System.out.println("В корзине пусто.");
        } else {
            System.out.println("Итого: " + totalPrice);
            System.out.println("Специальных товаров: " + specialCount);
        }
    }
}
