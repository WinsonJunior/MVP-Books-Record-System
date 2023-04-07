package com.example.backend_spring.entity;


import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@IdClass(author_books_id.class)
@Table(name="author_books")
public class author_books {
    @Id
    @ManyToOne
    @JoinColumn(name="author_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private authors authors;

    @Id
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="book_id")
    private books books;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;

    public author_books(authors authors, books books, Date createdAt, Date updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.authors = authors;
        this.books = books;
    }

}
