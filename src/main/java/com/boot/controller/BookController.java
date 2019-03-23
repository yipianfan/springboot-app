package com.boot.controller;

import com.boot.entity.Book;
import com.boot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path="add")
    public String addNewBook(String isbn, String description) {
        Book book = new Book();
        book.setIsbn(isbn);
        book.setDescription("Software engineer");
        bookRepository.save(book);
        return "success";
    }
}