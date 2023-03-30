package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table(name="people")
public class people {
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

    @Column(name="country_id")
    private BigInteger country_id;

}
