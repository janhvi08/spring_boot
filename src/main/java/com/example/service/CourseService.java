// src/main/java/com/example/service/CourseService.java
package com.example.service;

import com.example.model.Course;
import com.example.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    

    @SuppressWarnings("null")
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

}
