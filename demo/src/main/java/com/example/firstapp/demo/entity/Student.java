package com.example.firstapp.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String course;

    private String gender;
    private String address;
    private String phone;
    private String dob;
    private String image;
    private String password;
    private String role;
}
