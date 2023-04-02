package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="author_books")
public class author_books {
    @Id
    
    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name="author_id")
    private authors authors;

    @ManyToOne
    @JoinColumn(name="book_id")
    private books books;
}
