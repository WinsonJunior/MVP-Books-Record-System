package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="author_books")
public class author_books {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="createdAt")
    private String createdAt;

    @Column(name="updatedAt")
    private String updatedAt;

    @Column(name="author_id")
    private int author_id;

    @Column(name="book_id")
    private String book_id;
}
