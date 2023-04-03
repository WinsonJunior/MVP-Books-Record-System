package com.example.backend_spring.entity;


import lombok.Data;

import java.lang.Long;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@IdClass(book_rents_id.class)
@Table(name="book_rents")
public class book_rents {

    @Id
    @Column(name="people_id")
    private Long peopleId;

    @Id
    @Column(name="book_id")
    private Long bookId;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;
}
