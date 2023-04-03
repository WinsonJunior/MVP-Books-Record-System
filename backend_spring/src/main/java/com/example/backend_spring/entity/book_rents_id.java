package com.example.backend_spring.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data

public class book_rents_id implements Serializable {
    private long peopleId;
    private long bookId;

    public book_rents_id(long peopleId, long bookId) {
        this.peopleId = peopleId;
        this.bookId = bookId;
    }
}