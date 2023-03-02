package com.example.question_2.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.question_2.Models.Student;
import com.example.question_2.Service.ApiService;

@RestController
public class ApiController {
    private ApiService apiService;

    @GetMapping("/")
    public Iterable<Student> getAllStudents() {
        return apiService.findAll();
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return apiService.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return apiService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        apiService.deleteById(id);
    }

}
