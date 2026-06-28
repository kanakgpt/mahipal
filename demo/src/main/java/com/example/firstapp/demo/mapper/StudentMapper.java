package com.example.firstapp.demo.mapper;

import com.example.firstapp.demo.entity.Student;
import com.example.firstapp.demo.model.StudentDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO toDTO(Student student) {
        if (student == null) {
            return null;
        }
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setCourse(student.getCourse());
        dto.setGender(student.getGender());
        dto.setAddress(student.getAddress());
        dto.setPhone(student.getPhone());
        dto.setDob(student.getDob());
        dto.setImage(student.getImage());
        dto.setRole(student.getRole());
        return dto;
    }

    public Student toEntity(StudentDTO dto) {
        if (dto == null) {
            return null;
        }
        Student student = new Student();
        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setGender(dto.getGender());
        student.setAddress(dto.getAddress());
        student.setPhone(dto.getPhone());
        student.setDob(dto.getDob());
        student.setImage(dto.getImage());
        student.setRole(dto.getRole());
        return student;
    }
}
