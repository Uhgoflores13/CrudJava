package com.example.crudrapido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudrapido.repository.StudentRepository;
import com.example.crudrapido.entity.Student;
import java.util.List;
import java.util.Optional;

@Service

public class StudenService {
    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void saveOrUpdate (Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent (Long id) {
        studentRepository.deleteById(id);
    }
}
