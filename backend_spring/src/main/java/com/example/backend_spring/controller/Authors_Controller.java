package com.example.backend_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend_spring.entity.authors;
import com.example.backend_spring.repository.Authors_Repository;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@CrossOrigin(origins ="http://localhost:3000")
public class Authors_Controller {
    @Autowired
    private Authors_Repository authorsRepository;

    @GetMapping
    public List<authors> getAllAuthors() {
        return authorsRepository.findAll();
    }

    @PostMapping
    public authors createAuthor(@RequestBody authors author) {
        return authorsRepository.save(author);
    }

}