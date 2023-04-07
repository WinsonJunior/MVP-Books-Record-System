package com.example.backend_spring.controller;


import com.example.backend_spring.service.CountryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractMap;
import java.util.Map;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class Rand_Country_Controller {
    @Autowired
    CountryCodeService countryCodeService;

    @GetMapping("/getRandCountry")
    public Map<String, Map<String, String>> getRandCountry() {
        return Map.ofEntries(new AbstractMap.SimpleEntry<>("country", countryCodeService.getRandomCountryCode()));
    }
}
