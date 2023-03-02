package com.example.question_3.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "family")
public class Family {
    private String name;
    private int age;
    private String relationship;

    public Family() {
    }

    public Family(String name, int age, String relationship) {
        this.name = name;
        this.age = age;
        this.relationship = relationship;
    }
    
}
