package com.example.backend_spring.repository;

import com.example.backend_spring.entity.book_rents_id;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.backend_spring.entity.book_rents;

import java.util.List;

@Repository
public interface Book_Rents_Repository extends JpaRepository<book_rents, book_rents_id> {
    @Cacheable(value="getTopBookId")
    @Query("select br.book_id " +
            "from book_rents br " +
            "group by br.book_id " +
            "order by count(br.book_id) desc")
    List<Long> getTopBookId(Pageable pageable);

    @Cacheable(value="getTopBorrowerNames")
    @Query("select p.name " +
            "from book_rents br " +
            "left outer join people p " +
            "on br.people_id = p.id " +
            "where p.country_id = :countryId and br.book_id = :bookId " +
            "group by br.people_id, p.name " +
            "order by count(br.people_id) desc")
    List<String> getTopBorrowerNames(@Param("countryId") Long countryId, @Param("bookId") Long bookId, Pageable pageable);
}