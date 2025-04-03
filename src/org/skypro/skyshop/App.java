package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {
        // Создание товаров
        Product tv = new SimpleProduct("Телевизор LG", 40000);
        Product laptop = new DiscountedProduct("Ноутбук Asus", 50000, 20);
        Product fridge = new FixPriceProduct("Холодильник Samsung");

        // Создание статей
        Article article1 = new Article("Товар недели", "Рассмотрим телевизоры...");
        Article article2 = new Article("Рекомендации", "Как выбрать ноутбук...");

        // Создание поискового движка
        SearchEngine searchEngine = new SearchEngine(10);
        searchEngine.add((Searchable) tv);
        searchEngine.add((Searchable) laptop);
        searchEngine.add((Searchable) fridge);
        searchEngine.add(article1);
        searchEngine.add(article2);

        // Демонстрация поиска
        System.out.println("Результаты поиска для 'телевизор':");
        for (var result : searchEngine.search("телевизор")) {
            if (result != null) {
                System.out.println(result.getStringRepresentation());
            }
        }

        System.out.println("\nРезультаты поиска для 'ноутбук':");
        for (var result : searchEngine.search("ноутбук")) {
            if (result != null) {
                System.out.println(result.getStringRepresentation());
            }
        }
    }
}
