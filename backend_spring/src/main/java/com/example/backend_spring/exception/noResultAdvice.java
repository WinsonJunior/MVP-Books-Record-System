package com.example.backend_spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class noResultAdvice {
    @ResponseBody
    @ExceptionHandler(noResultException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> exceptionHandler(noResultException noResultException) {
        Map<String, String> errorHashMap = new HashMap<>();
        errorHashMap.put("message", noResultException.getMessage());
        return errorHashMap;
    }
}
