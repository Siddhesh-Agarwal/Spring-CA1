package com.example.question_3.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.question_3.Models.Family;

interface FamilyRepository extends JpaRepository<Family, Integer> {
}

@RestController
public class ApiController {
    private final FamilyRepository familyRepository;

    public ApiController(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    @GetMapping("/")
    public Iterable<Family> getFamily() {
        return familyRepository.findAll();
    }
}
