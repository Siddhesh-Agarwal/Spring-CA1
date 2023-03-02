package com.example.question_2.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.question_2.Models.Student;

public interface ApiService extends JpaRepository<Student, Integer> {
}
