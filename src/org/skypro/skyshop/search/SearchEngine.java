package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] searchableItems; // Массив элементов для поиска
    private int count; // Текущее количество элементов в массиве

    // Конструктор
    public SearchEngine(int capacity) {
        this.searchableItems = new Searchable[capacity];
        this.count = 0;
    }

    // Метод добавления нового объекта
    public void add(Searchable item) {
        if (count < searchableItems.length) {
            searchableItems[count++] = item;
        } else {
            System.out.println("Невозможно добавить объект: превышен лимит.");
        }
    }

    // Метод поиска по массиву
    public Searchable[] search(String searchString) {
        Searchable[] results = new Searchable[5]; // Массив для хранения результатов (максимум 5)
        int resultCount = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().toLowerCase().contains(searchString.toLowerCase())) {
                results[resultCount++] = item;
                if (resultCount == 5) break; // Ограничение на 5 элементов
            }
        }
        return results;
    }
}
