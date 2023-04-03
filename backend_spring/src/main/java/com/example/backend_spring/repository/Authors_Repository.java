package com.example.backend_spring.repository;

import com.example.backend_spring.entity.authors;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Authors_Repository extends JpaRepository<authors, Integer> {

}
