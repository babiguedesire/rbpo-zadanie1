package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    // Endpoint 1 : retourne du texte
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    // Endpoint 2 : retourne des nombres
    @GetMapping("/numbers")
    public List<Integer> numbers() {
        return List.of(1, 2, 3, 4, 5);
    }
}
