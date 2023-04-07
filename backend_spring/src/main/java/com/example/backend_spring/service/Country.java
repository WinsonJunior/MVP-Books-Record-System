package com.example.backend_spring.service;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Country {
    private String full_name;
    private String alpha_code;
    private Long country_code;

    public Country() {

    }
}
