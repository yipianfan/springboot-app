package com.boot.controller;

import com.boot.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("readingList")
@ConfigurationProperties(prefix = "person")
public class ReadingListController {
    private static final Logger log = LoggerFactory.getLogger(ReadingListController.class);
    private String name;

    public void setName(String name) { this.name = name; }

    @RequestMapping(value="/{reader}", method= RequestMethod.GET)
    public String readersBooks(@PathVariable String reader, Model model) {
        log.info("reader is: " + reader);
        System.out.println("-->" + name);
        List<Book> readingList = null;
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "success";
    }

    @RequestMapping(value="/{reader}", method=RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        return "redirect:/{reader}";
    }
}