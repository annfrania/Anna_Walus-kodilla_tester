package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager extends Book {

    public BookManager(String title, String author) {
        super(title, author);
    }

    public Book createBook(){
        return new Book(getTitle(), getAuthor());
    }


}
