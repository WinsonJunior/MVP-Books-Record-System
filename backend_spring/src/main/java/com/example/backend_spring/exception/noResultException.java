package com.example.backend_spring.exception;

public class noResultException extends RuntimeException {
    public noResultException() {
        super("no results");
    }
}