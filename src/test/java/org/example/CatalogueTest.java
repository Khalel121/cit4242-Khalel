package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatalogueTest {

    @Test
    void countsLongBooksFromMemory() {
        BookSource source = new InMemoryBookSource();
        Catalogue catalogue = new Catalogue(source);

        assertEquals(3, catalogue.getBooks().size());
        assertEquals(2, catalogue.countLongBooks());
    }
}