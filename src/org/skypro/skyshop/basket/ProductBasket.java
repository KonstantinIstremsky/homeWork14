package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5]; // Массив для хранения продуктов
    private int size = 0; // Текущий размер корзины

    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        if (size >= products.length) {
            System.out.println("Невозможно добавить продукт: корзина заполнена.");
            return;
        }
        products[size++] = product;
    }

    // Метод получения общей стоимости корзины
    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    // Метод печати содержимого корзины
    public void printBasketContents() {
        if (size == 0) {
            System.out.println("В корзине пусто.");
            return;
        }
        int total = 0;
        for (int i = 0; i < size; i++) {
            Product product = products[i];
            System.out.println(product.getName() + ": " + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Итого: " + total);
    }

    // Метод проверки продукта в корзине по имени
    public boolean containsProduct(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Метод очистки корзины
    public void clearBasket() {
        for (int i = 0; i < size; i++) {
            products[i] = null;
        }
        size = 0;
    }
}
