// src/main/java/com/example/model/Course.java
package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {

    @Id
    private Integer id;
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String subject;

}
