package com.example.firstapp.demo.model;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


@Data
public class StudentDTO {
    private Long id;


  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only letters")
  private String name;
  @Email(message = "Invalid email format")
  @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid email format")
  private String email;

    private String course;
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Gender must contain only letters")
    private String gender;
    private String address;
    private String phone;
    private String dob;
    private String image;
    private String role;
}
