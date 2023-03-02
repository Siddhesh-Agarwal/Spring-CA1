# Question 1

## ApiController

```java
package com.example.question_1.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.question_1.Models.Address;

@RestController
public class ApiController {
    @GetMapping("/")
    public Iterable<Address> getAddresses() {
        // Create a list of addresses
        ArrayList<Address> addresses = new ArrayList<Address>();
        // Add some addresses to the list
        addresses.add(new Address("John", "123 Main Street", 12345));
        addresses.add(new Address("Jane", "456 Main Street", 12345));
        addresses.add(new Address("Joe", "789 Main Street", 12345));
        // Return the list of addresses
        return addresses;
    }
}
```

## Models

```java
package com.example.question_1.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String employeeName;
    private String address;
    private int pincode;

    public Address() {
    }

    public Address(String employeeName, String address, int pincode) {
        this.employeeName = employeeName;
        this.address = address;
        this.pincode = pincode;
    }
}
```
____

# Question 2

## Controllers

```java
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
```

## Models

```java
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

```

## Service

```java
package com.example.question_2.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.question_2.Models.Student;

public interface ApiService extends JpaRepository<Student, Integer> {
}

```

____

# Question 3

## Controllers

```java
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
```

## Models

```java
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
```

____

# Question 4

## Controllers

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
```

____

# Question 5

## Controllers

```java
package com.example.question_2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
```

## Models

```java
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
```

## Service

```java
package com.example.question_2.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.question_2.Models.Student;

public interface ApiService extends JpaRepository<Student, Integer> {
}
```