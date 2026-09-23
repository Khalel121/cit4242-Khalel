package org.example;

public record Book(String title, int pages) {

    public boolean isLong() {
        return pages > 300;
    }
}