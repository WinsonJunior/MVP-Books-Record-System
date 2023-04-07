package com.example.backend_spring.repository;

import com.example.backend_spring.entity.author_books;
import com.example.backend_spring.entity.author_books_id;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Author_Books_Repository extends JpaRepository<author_books, author_books_id> {
    @Cacheable("getAuthorId")
    @Query("select authors.id " +
            "from author_books " +
            "where books.id = :bookId")
    Integer getAuthorId(@Param("bookId") Integer bookId);
}