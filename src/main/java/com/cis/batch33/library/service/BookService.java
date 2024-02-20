package com.cis.batch33.library.service;

import com.cis.batch33.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class BookService {
    private Map<Integer, Book> bookMap = new HashMap<>();
    public Book createBook(Book book){
        int bookId = new Random().nextInt();
        book.setBookId(bookId);
        bookMap.put(bookId, book);
        return book;
    }
    public Book getBook(int bookId){
        return bookMap.get(bookId);
    }

    public Book updateBook(Book book){
        int bookId = book.getBookId();
        bookMap.put(bookId,book);
        return book;
    }
    public void deleteBook(int bookId)
    {
       bookMap.remove(bookId);
    }
}
