package com.example.backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend_spring.entity.book_rents;

@Repository
public interface Book_Rents_Repository extends JpaRepository<book_rents, Integer> {

}