package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@IdClass(author_books_id.class)
@Table(name="author_books")
public class author_books {

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;

    @Id
    @Column(name="author_id")
    private long authorId;

    @Id
    @Column(name="book_id")
    private long bookId;
}
