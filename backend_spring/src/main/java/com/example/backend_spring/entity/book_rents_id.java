package com.example.backend_spring.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class book_rents_id implements Serializable {
    private Long people_id;
    private Long book_id;
    private java.util.Date created_at;
    private java.util.Date updated_at;

    public book_rents_id(Long people_id, Long book_id, Date created_at, Date updated_at) {
        this.people_id = people_id;
        this.book_id = book_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public book_rents_id() {

    }
}