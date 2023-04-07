package com.example.backend_spring.service;

import com.example.backend_spring.entity.top_read_books;
import com.example.backend_spring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Top3BookService {
    @Autowired
    People_Repository people_repository;
    @Autowired
    Authors_Repository authors_repository;
    @Autowired
    Books_Repository books_repository;
    @Autowired
    Book_Rents_Repository book_rents_repository;
    @Autowired
    Author_Books_Repository author_books_repository;

    @Autowired
    CountryCodeService countryCodeService;

    private Pageable page = PageRequest.of(0,3);

    public List<top_read_books> getTop3Book(String alphaCode) {
        ArrayList<top_read_books> topReadBooks = new ArrayList<>();
        long countryCode = countryCodeService.getCountryCode(alphaCode);
        List<Long> getBooks = book_rents_repository.getTopBookId(page);
        for(Long book : getBooks) {
            Integer bookId = book.intValue();
            String bookName = books_repository.findById(bookId).get().getName();

            Integer authorId = author_books_repository.getAuthorId(bookId);
            String authorName = authors_repository.findById(authorId).get().getName();

            List<String> topBookBorrower = book_rents_repository.getTopBorrowerNames(countryCode, book, page);
            topReadBooks.add(new top_read_books(bookName, authorName, topBookBorrower));
        }
        if(topReadBooks.size() > 0) {
            return topReadBooks;
        }
        return List.of();
    }

}
