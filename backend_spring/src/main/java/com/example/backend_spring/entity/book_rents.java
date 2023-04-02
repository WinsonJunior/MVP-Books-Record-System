package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="book_rents")
public class book_rents {
    @Id

    @ManyToOne
    @JoinColumn(name="person_id")
    private people people;

    @ManyToOne
    @JoinColumn(name="book_id")
    private books books;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;
}
