package com.example.backend_spring.repository;

import org.springframework.stereotype.Repository;
import com.example.backend_spring.entity.books;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Books_Repository extends JpaRepository<books, Integer> {

}