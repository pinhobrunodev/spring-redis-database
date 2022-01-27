package com.pinhobrunodev.redis.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.UUID;

@Data
@RedisHash("Student")
public class Student implements Serializable {


    private UUID id;
    private String name;
    private int grade;
}
