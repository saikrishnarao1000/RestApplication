package com.cis.batch33.library.controller;

import com.cis.batch33.library.model.Book;
import com.cis.batch33.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookservice;
    @PostMapping
    public Book createBook(@RequestBody Book book){

        return bookservice.createBook(book);
    }
    @GetMapping
    public Book getBook(int bookId)
    {
        return bookservice.getBook(bookId);
    }
    @PutMapping
    public Book updateBook(@RequestBody Book book)
    {
        return bookservice.updateBook(book);
    }
    @DeleteMapping
    public void deleteBook(int bookId)
    {
        bookservice.deleteBook(bookId);
    }
}
