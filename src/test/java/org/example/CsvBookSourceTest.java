package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvBookSourceTest {

    @Test
    void loadsBooksFromCsv() {
        BookSource source = new CsvBookSource("books.csv");
        Catalogue catalogue = new Catalogue(source);

        List<Book> expected = List.of(
                new Book("Clean Code", 464),
                new Book("Effective Java", 416),
                new Book("The Little Prince", 96)
        );

        assertEquals(expected, catalogue.getBooks());
        assertEquals(2, catalogue.countLongBooks());
    }
}