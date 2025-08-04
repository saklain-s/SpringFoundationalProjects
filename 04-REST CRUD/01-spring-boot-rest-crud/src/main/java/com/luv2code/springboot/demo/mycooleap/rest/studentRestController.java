package com.luv2code.springboot.demo.mycooleap.rest;

import com.luv2code.springboot.demo.mycooleap.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

/**
 * REST controller for managing student data.
 */
@RestController
@RequestMapping("/api")
public class studentRestController {
    /**
     * List of students initialized at startup.
     */
    private List<Student> theStudents = new ArrayList<>();

    /**
     * Initializes the student list with sample data.
     */
    @PostConstruct
    public void loadData() {
        theStudents.add(new Student("Saklain", "Shaik"));
        theStudents.add(new Student("Roman", "Shaik"));
        theStudents.add(new Student("Saklain", "Nigges"));
    }

    /**
     * Retrieves the list of all students.
     * @return List of students
     */
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents != null ? theStudents : new ArrayList<>();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId){

        if((studentId >= theStudents.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student id not found " + studentId);
        }
        return theStudents.get(studentId);
    }

    // Add an exception handler using @exceptionHandler

}
