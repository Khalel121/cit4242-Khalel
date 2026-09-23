package org.example;

import java.util.List;

public class Catalogue {

    private final List<Book> books;

    public Catalogue(BookSource source) {
        this.books = source.load();
    }

    public List<Book> getBooks() {
        return books;
    }

    public int countLongBooks() {
        int count = 0;

        for (Book book : books) {
            if (book.isLong()) {
                count++;
            }
        }

        return count;
    }
}