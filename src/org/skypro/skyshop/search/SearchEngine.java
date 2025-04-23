package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] searchableItems;
    private int count;

    public SearchEngine(int capacity) {
        this.searchableItems = new Searchable[capacity];
        this.count = 0;
    }

    public void add(Searchable item) {
        if (count < searchableItems.length) {
            searchableItems[count++] = item;
        } else {
            System.out.println("Невозможно добавить объект: превышен лимит.");
        }
    }

    public Searchable[] search(String searchString) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().toLowerCase().contains(searchString.toLowerCase())) {
                results[resultCount++] = item;
                if (resultCount == 5) break;
            }
        }
        return results;
    }


    public Searchable findBestMatch(String searchString) throws BestResultNotFound {
        int maxMatches = -1;
        Searchable bestMatch = null;

        for (Searchable item : searchableItems) {
            if (item != null) {
                int matches = 0;
                String searchTerm = item.getSearchTerm().toLowerCase();
                int index = searchTerm.indexOf(searchString.toLowerCase());
                while (index != -1) {
                    matches++;
                    index = searchTerm.indexOf(searchString.toLowerCase(), index + searchString.length());
                }

                if (matches > maxMatches) {
                    maxMatches = matches;
                    bestMatch = item;
                }
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound(searchString);
        }

        return bestMatch;
    }
}
