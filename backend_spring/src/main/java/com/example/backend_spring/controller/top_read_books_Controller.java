package com.example.backend_spring.controller;

import com.example.backend_spring.entity.top_read_books;
import com.example.backend_spring.service.Top3BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class top_read_books_Controller {
    @Autowired
    Top3BookService top3BookService;

    @GetMapping("/getTop3ReadBook")
    public List<top_read_books> getTop3ReadBook(@RequestParam("country_code") String countryCode) {
        try {

            return top3BookService.getTop3Book(countryCode);
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
