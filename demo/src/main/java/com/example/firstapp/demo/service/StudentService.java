package com.example.firstapp.demo.service;

import com.example.firstapp.demo.entity.Student;
import com.example.firstapp.demo.exception.ResourceNotFoundException;
import com.example.firstapp.demo.mapper.StudentMapper;
import com.example.firstapp.demo.model.StudentDTO;
import com.example.firstapp.demo.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    public List<StudentDTO> getAllStudents() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public StudentDTO save(StudentDTO studentDTO) {
        Student student = mapper.toEntity(studentDTO);
        Student savedStudent = repository.save(student);
        return mapper.toDTO(savedStudent);
    }

    public StudentDTO getStudentById(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        return mapper.toDTO(student);
    }

    public StudentDTO updateStudent(Long id, StudentDTO studentDetailsDTO) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        
        student.setName(studentDetailsDTO.getName());
        student.setEmail(studentDetailsDTO.getEmail());
        student.setCourse(studentDetailsDTO.getCourse());
        student.setGender(studentDetailsDTO.getGender());
        student.setAddress(studentDetailsDTO.getAddress());
        student.setPhone(studentDetailsDTO.getPhone());
        student.setDob(studentDetailsDTO.getDob());
        student.setImage(studentDetailsDTO.getImage());
        student.setRole(studentDetailsDTO.getRole());
        
        Student updatedStudent = repository.save(student);
        return mapper.toDTO(updatedStudent);
    }

    public void deleteStudent(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        repository.delete(student);
    }
}
