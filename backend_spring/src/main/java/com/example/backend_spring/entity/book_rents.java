package com.example.backend_spring.entity;


import com.sun.istack.NotNull;
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
    private Long people_id;

    @Id
    @Column(name="book_id")
    private Long book_id;

    @Id
    @Column(name="created_at")
    private Date created_at;

    @Id
    @Column(name="updated_at")
    private Date updated_at;

    public book_rents(Long people_id, Long book_id, Date created_at, Date updated_at) {
        this.people_id = people_id;
        this.book_id = book_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public book_rents() { }
}
