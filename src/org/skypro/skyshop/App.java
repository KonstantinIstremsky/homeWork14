package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        // Создание корзины
        ProductBasket basket = new ProductBasket();

        // Создание продуктов
        Product product1 = new Product("Хлеб", 50);
        Product product2 = new Product("Молоко", 70);
        Product product3 = new Product("Яблоки", 150);
        Product product4 = new Product("Сыр", 300);
        Product product5 = new Product("Шоколад", 120);
        Product product6 = new Product("Вода", 40);

        // Добавление продуктов в корзину
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        // Попытка добавить продукт в заполненную корзину
        basket.addProduct(product6);

        // Печать содержимого корзины
        basket.printBasketContents();

        // Получение общей стоимости корзины
        System.out.println("Общая стоимость корзины: " + basket.getTotalCost());

        // Поиск продукта в корзине
        System.out.println("Корзина содержит 'Хлеб': " + basket.containsProduct("Хлеб"));
        System.out.println("Корзина содержит 'Сок': " + basket.containsProduct("Сок"));

        // Очистка корзины
        basket.clearBasket();

        // Печать содержимого пустой корзины
        basket.printBasketContents();

        // Получение стоимости пустой корзины
        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalCost());

        // Поиск продукта в пустой корзине
        System.out.println("Корзина содержит 'Хлеб': " + basket.containsProduct("Хлеб"));
    }
}
