package com.example.question_2.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column
    private int id;
    @Column
    private String studentName;
    @Column
    private String departmentName;
    @Column
    private String section;
    @Column
    private long mobile;
    @Column
    private String mailid;
    @Column
    private String address;

    public Student() {
    }

    public Student(int id, String studentName, String departmentName, String section, long mobile, String mailid,
            String address) {
        this.id = id;
        this.studentName = studentName;
        this.departmentName = departmentName;
        this.section = section;
        this.mobile = mobile;
        this.mailid = mailid;
        this.address = address;
    }
}
