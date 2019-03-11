package com.boot.controller;

import com.boot.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("readingList")
public class ReadingListController {

    @RequestMapping(value="/{reader}", method= RequestMethod.GET)
    public String readersBooks(@PathVariable String reader, Model model) {
        System.out.println("reader is: " + reader);
        List<Book> readingList = null;
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value="/{reader}", method=RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        return "redirect:/{reader}";
    }
}