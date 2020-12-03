package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    Set<Book> bookList = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        for (Book b : bookList) {// jesli któraś z nowo dodawanych książek (książka book- obiekt z linii 10) jest taka sama jak wartość
            if (b.equals(book)) {// którejś książki b (które są już w secie) to należy zwrócić książkę b, która już jest.
                return b;
            }
        }
        bookList.add(book);
        return book;

    }

    public int getSize() {
        return bookList.size();
    }

}