package com.example.backend_spring.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="authors")
public class authors {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="created_at")
    private Date created_at;

    @Column(name="updated_at")
    private Date updated_at;

}
