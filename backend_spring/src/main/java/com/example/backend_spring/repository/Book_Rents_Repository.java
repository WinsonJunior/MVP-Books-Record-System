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
    @Query("select br.bookId " +
            "from book_rents br " +
            "group by br.bookId " +
            "order by count(br.bookId) desc")
    List<Long> getTopBookId(Pageable pageable);

    @Cacheable(value="getTopBorrowerNames")
    @Query("select p.name " +
            "from book_rents br " +
            "left outer join people p " +
            "on br.peopleId = p.id " +
            "where p.country_id = :countryId and br.bookId = :bookId " +
            "group by br.peopleId, p.name " +
            "order by count(br.peopleId) desc")
    List<String> getTopBorrowerNames(@Param("countryId") Long countryId, @Param("bookId") Long bookId, Pageable pageable);
}