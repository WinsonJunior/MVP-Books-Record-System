package com.example.backend_spring.entity;


import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class top_read_books {
    private String name;
    private String author;
    private List<String> borrower;

    public top_read_books(String name, String author, List<String> borrower) {
        this.name = name;
        this.author = author;
        this.borrower = borrower;
    }
}
