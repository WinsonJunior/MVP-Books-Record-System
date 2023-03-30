package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="book_rents")
public class book_rents {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="person_id")
    private int person_id;

    @Column(name="book_id")
    private String book_id;

    @Column(name="createdAt")
    private String createdAt;

    @Column(name="updatedAt")
    private String updatedAt;
}
