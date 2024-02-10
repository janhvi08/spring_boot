// src/main/java/com/example/controller/CourseController.java
package com.example.controller;

import com.example.model.Course;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addStudent")
    public Course addCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

}
