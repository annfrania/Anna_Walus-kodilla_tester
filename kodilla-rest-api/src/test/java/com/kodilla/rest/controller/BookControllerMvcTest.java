package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.controller.BookService;
import com.kodilla.rest.domain.BookDto;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)                   // [1]
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;                         // [2]

    @MockBean
    private BookService bookService;                 // [3]

    @Test
    public void shouldFetchBooks() throws Exception {
//given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")                      // [1]
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))                     // [2]
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }
    @Test
    public void shouldAddBooks() throws Exception {
        //given
        List<BookDto> booksList = new ArrayList<>();
        BookDto book3 = new BookDto("title 3", "author 3");

        Gson gson = new Gson();
        String jsonInString = gson.toJson(book3);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .content(jsonInString)// [1]
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200)) ;                   // [2]
    }
    }