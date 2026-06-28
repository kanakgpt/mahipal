package com.example.firstapp.demo.service;

import com.example.firstapp.demo.entity.Student;
import com.example.firstapp.demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student> getAllStudents() {

        return repository.findAll();
    }

    public Student save(Student student) {
        return repository.save(student);
    }
}
