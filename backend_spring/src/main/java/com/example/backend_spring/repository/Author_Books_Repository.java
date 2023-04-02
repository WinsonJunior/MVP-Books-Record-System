package com.example.backend_spring.repository;

import com.example.backend_spring.entity.author_books;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Author_Books_Repository extends JpaRepository<author_books, Integer> {

}