package com.example.firstapp.demo.controller;

import com.example.firstapp.demo.entity.Student;
import com.example.firstapp.demo.model.StudentDTO;
import com.example.firstapp.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping(value = "/welcome")
    public String welcomeMsg() {
        return "Welcome to Student API";
    }

    @GetMapping(value = "/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student saveStudent(
            @RequestBody @Valid StudentDTO student) {

        return null;
    }
}
