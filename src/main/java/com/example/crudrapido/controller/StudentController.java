package com.example.crudrapido.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.crudrapido.entity.Student;
import com.example.crudrapido.service.StudenService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;





@RestController
@RequestMapping(path = "/api/v1/students")



public class StudentController {

    @Autowired
    private StudenService studentService;

    @GetMapping
    public List<Student> getAll(){
       return studentService.getStudents();
    }


    @PostMapping
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        System.out.println("Student saved");
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
       return studentService.getStudentById (studentId);
    }
}
