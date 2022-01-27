package com.pinhobrunodev.redis.controller;

import com.pinhobrunodev.redis.model.Student;
import com.pinhobrunodev.redis.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/students")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.save(student));
    }
    @GetMapping(value = "/students")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findAll());
    }
    @GetMapping(value = "/students/{id}")
    public ResponseEntity<Student> findById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findById(id));
    }

}
