package com.example.firstapp.demo.controller;

import com.example.firstapp.demo.model.ApiResponse;
import com.example.firstapp.demo.model.StudentDTO;
import com.example.firstapp.demo.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping(value = "/welcome")
    public ResponseEntity<ApiResponse<String>> welcomeMsg() {
        return ResponseEntity.ok(new ApiResponse<>(true, "Welcome to Student API", "Hello World"));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<StudentDTO>>> getAllStudents() {
        List<StudentDTO> students = service.getAllStudents();
        return ResponseEntity.ok(new ApiResponse<>(true, "Students fetched successfully", students));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentDTO>> getStudentById(@PathVariable Long id) {
        StudentDTO student = service.getStudentById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Student fetched successfully", student));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<StudentDTO>> saveStudent(@RequestBody @Valid StudentDTO student) {
        StudentDTO savedStudent = service.save(student);
        return new ResponseEntity<>(new ApiResponse<>(true, "Student saved successfully", savedStudent), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentDTO>> updateStudent(@PathVariable Long id, @RequestBody @Valid StudentDTO studentDTO) {
        StudentDTO updatedStudent = service.updateStudent(id, studentDTO);
        return ResponseEntity.ok(new ApiResponse<>(true, "Student updated successfully", updatedStudent));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Student deleted successfully with id: " + id, null));
    }
}
