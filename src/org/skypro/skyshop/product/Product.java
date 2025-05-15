package org.skypro.skyshop.product;

public abstract class Product {
    private final String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя продукта не может быть пустым или содержать только пробелы.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
