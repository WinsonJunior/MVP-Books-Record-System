package com.example.backend_spring.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class author_books_id implements Serializable {
    private long authorId;
    private long bookId;

    public author_books_id(long authorId, long bookId){
        this.authorId = authorId;
        this.bookId = bookId;
    }
}
