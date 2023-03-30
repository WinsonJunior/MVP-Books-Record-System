package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="books")
public class books {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="createdAt")
    private String createdAt;

    @Column(name="updatedAt")
    private String updatedAt;
}
