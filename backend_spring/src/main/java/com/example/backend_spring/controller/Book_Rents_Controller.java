package com.example.backend_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend_spring.entity.book_rents;
import com.example.backend_spring.repository.Book_Rents_Repository;

@RestController
@RequestMapping("/api/book_rents")
@CrossOrigin(origins ="http://localhost:3000")
public class Book_Rents_Controller {
    @Autowired
    private Book_Rents_Repository book_Rents_Repository;

    @GetMapping
    public List<book_rents> getAllBook_Rents() {
        return book_Rents_Repository.findAll();
    }

    @PostMapping
    public book_rents createBookRents(@RequestBody book_rents book_rents) {
        return book_Rents_Repository.save(book_rents);
    }
}
