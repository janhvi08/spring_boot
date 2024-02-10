// src/main/java/com/example/repository/CourseRepository.java
package com.example.repository;

import com.example.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
