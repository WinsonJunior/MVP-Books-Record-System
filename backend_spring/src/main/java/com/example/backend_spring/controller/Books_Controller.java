package com.example.backend_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend_spring.entity.books;
import com.example.backend_spring.repository.Books_Repository;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins ="http://localhost:3000")
public class Books_Controller {
    @Autowired
    private Books_Repository booksRepository;

    @GetMapping
    public List<books> getAllBooks() {
        return booksRepository.findAll();
    }

    @PostMapping
    public books createBook(@RequestBody books book) {
        return booksRepository.save(book);
    }
}
