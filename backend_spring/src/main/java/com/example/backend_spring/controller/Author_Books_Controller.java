package com.example.backend_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend_spring.entity.author_books;
import com.example.backend_spring.repository.Author_Books_Repository;

@RestController
@RequestMapping("/api/author_books")
public class Author_Books_Controller {
    @Autowired
    private Author_Books_Repository author_Books_Repository;

    @GetMapping
    public List<author_books> getAllAuthorBookks() {
        return author_Books_Repository.findAll();
    }

    @PostMapping
    public author_books createAuthorBooks(@RequestBody author_books author_books) {
        return author_Books_Repository.save(author_books);
    }
    
}
