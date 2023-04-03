package com.example.backend_spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend_spring.entity.books;
import com.example.backend_spring.repository.Books_Repository;

@RestController
@RequestMapping("/api/books")
public class Books_Controller {
    @Autowired
    private Books_Repository booksRepository;

    @GetMapping
    public List<books> getAllBooks() {
        return booksRepository.findAll();
    }

    @PostMapping
    public books createBook(@RequestBody books book) {
        book.setCreatedAt(new Date());
        book.setUpdatedAt(new Date());
        return booksRepository.save(book);
    }
}
