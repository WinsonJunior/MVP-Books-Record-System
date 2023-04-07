package com.example.backend_spring.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class author_books_id implements Serializable {
    private authors authors;
    private books books;

    public author_books_id(authors authors, books books){
        this.authors = authors;
        this.books = books;
    }
}
