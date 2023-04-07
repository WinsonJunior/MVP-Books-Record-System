package com.example.backend_spring.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Author_Books_DTO {
    private Integer authorId;
    private Integer bookId;
    private Date createdAt;
    private Date updatedAt;

    public Author_Books_DTO(Integer authorId, Integer bookId, Date createdAt, Date updatedAt) {
        this.authorId = authorId;
        this.bookId = bookId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
