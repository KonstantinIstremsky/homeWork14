package org.skypro.skyshop.product;

public abstract class Product {
    private final String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя продукта не может быть null, пустым или состоять только из пробелов.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод
    public abstract int getPrice();
}
