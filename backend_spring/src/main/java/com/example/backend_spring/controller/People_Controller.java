package com.example.backend_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend_spring.entity.people;
import com.example.backend_spring.repository.People_Repository;

@RestController
@RequestMapping("/api/people")
@CrossOrigin(origins ="http://localhost:3000")
public class People_Controller {
    @Autowired
    private People_Repository people_Repository;

    @GetMapping
    public List<people> getAllPeople() {
        return people_Repository.findAll();
    }

    @PostMapping
    public people createPeople(@RequestBody people people) {
        return people_Repository.save(people);
    }
}
