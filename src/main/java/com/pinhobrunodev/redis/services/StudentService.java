package com.pinhobrunodev.redis.services;

import com.pinhobrunodev.redis.model.Student;
import com.pinhobrunodev.redis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

/*
        First Get = 14ms
        Second Get = 5ms
 */
    @Cacheable(value = "studentCache")
    public Student findById(UUID id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Erro"));
    }

}
