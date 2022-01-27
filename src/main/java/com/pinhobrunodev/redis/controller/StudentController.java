package com.pinhobrunodev.redis.controller;

import com.pinhobrunodev.redis.model.Student;
import com.pinhobrunodev.redis.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
