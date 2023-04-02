package com.example.backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend_spring.entity.people;

@Repository
public interface People_Repository extends JpaRepository<people, Integer> {
    
}