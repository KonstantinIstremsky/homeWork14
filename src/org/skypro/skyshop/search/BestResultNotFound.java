package org.skypro.skyshop.search;

public class BestResultNotFound extends Exception {
    public BestResultNotFound(String searchString) {
        super("Не найдено подходящего объекта для поискового запроса: " + searchString);
    }
}