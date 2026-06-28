package com.example.firstapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//CRUD
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
