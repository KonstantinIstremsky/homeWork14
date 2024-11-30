package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    // Конструктор
    public Product(String name) {
        this.name = name;
    }

    // Получение имени продукта
    public String getName() {
        return name;
    }

    // Абстрактный метод для получения цены
    public abstract int getPrice();

    // Реализация методов интерфейса Searchable
    @Override
    public String getSearchTerm() {
        return name; // Для поиска используется имя продукта
    }

    @Override
    public String getType() {
        return "PRODUCT"; // Тип контента — товар
    }

    @Override
    public String getStringRepresentation() {
        return name + " — " + getType();
    }

    public abstract boolean isSpecial();
}
