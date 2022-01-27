package com.pinhobrunodev.redis.services;

import com.pinhobrunodev.redis.model.Student;
import com.pinhobrunodev.redis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student save (Student student){
        return studentRepository.save(student);
    }
    public List<Student> findAll(){
        return (List<Student>) studentRepository.findAll();
    }


}
