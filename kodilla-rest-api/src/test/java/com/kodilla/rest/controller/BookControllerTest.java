package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    @Test
    public void shouldFetchBooks(){
        //give
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1","Author 1"));
        bookList.add(new BookDto("Title 2","Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //Mockito.when(bookController.getBooks()).thenReturn(bookList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);

    }
    @Test
    public void shouldAddBooks(){
        //give
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        //when
        BookDto mockBook = new BookDto("title 3","author 3");
        bookController.addBook(mockBook);

        //then
        Mockito.verify(bookServiceMock,Mockito.times(1)).addBook(mockBook);
    }
}
