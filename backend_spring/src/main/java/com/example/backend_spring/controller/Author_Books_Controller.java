package com.example.backend_spring.controller;

import java.util.List;

import com.example.backend_spring.dto.Author_Books_DTO;
import com.example.backend_spring.entity.authors;
import com.example.backend_spring.entity.books;
import com.example.backend_spring.repository.Authors_Repository;
import com.example.backend_spring.repository.Books_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend_spring.entity.author_books;
import com.example.backend_spring.repository.Author_Books_Repository;

@RestController
@RequestMapping("/api/author_books")
@CrossOrigin(origins ="http://localhost:3000")
public class Author_Books_Controller {
    @Autowired
    private Author_Books_Repository author_Books_Repository;

    @Autowired
    private Authors_Repository authors_Repository;

    @Autowired
    private Books_Repository books_repository;

    @GetMapping
    public List<author_books> getAllAuthorBookks() {
        return author_Books_Repository.findAll();
    }

    @PostMapping
    public author_books createAuthorBooks(@RequestBody author_books author_books) {
        return author_Books_Repository.save(author_books);
    }

    public author_books convertToEntity(Author_Books_DTO author_books_dto){
        try{
            authors authors = authors_Repository.findById(author_books_dto.getAuthorId()).get();
            books books = books_repository.findById(author_books_dto.getBookId()).get();
            return new author_books(authors, books, author_books_dto.getCreatedAt(), author_books_dto.getUpdatedAt());
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
}
