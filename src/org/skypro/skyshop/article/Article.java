package org.skypro.skyshop.article;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private final String title; // Название статьи
    private final String text;  // Текст статьи

    // Конструктор
    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    // Метод получения названия статьи
    public String getTitle() {
        return title;
    }

    // Метод получения текста статьи
    public String getText() {
        return text;
    }

    // Реализация метода toString
    @Override
    public String toString() {
        return title + "\n" + text;
    }

    // Реализация методов интерфейса Searchable
    @Override
    public String getSearchTerm() {
        return title + " " + text; // Текст поиска: название + текст статьи
    }

    @Override
    public String getType() {
        return "ARTICLE"; // Тип объекта — статья
    }

    @Override
    public String getName() {
        return title; // Имя объекта — название статьи
    }
}
