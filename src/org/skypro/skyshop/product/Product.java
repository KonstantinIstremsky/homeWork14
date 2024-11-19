package org.skypro.skyshop.product;

public class Product {
    private final String name; // Название продукта
    private final int price;   // Стоимость продукта

    // Конструктор
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
