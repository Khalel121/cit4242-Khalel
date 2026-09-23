package org.example;

import java.util.List;

public interface BookSource {

    List<Book> load();
}