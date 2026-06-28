package com.example.firstapp.demo.model;

import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


@Data
public class StudentDTO {
    private Long id;


  @NotNull
  //@Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only letters")
  private String name;
  @Email(message = "Invalid email format")
  private String email;

    private String course;

    private String gender;
    private String address;
    private String phone;
    private String dob;
}
