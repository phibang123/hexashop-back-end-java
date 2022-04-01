package com.example.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorischemas")
public class CategoriesDTO {
    @Id
    private Number ids;

    private String name;

    private String slug;

    private String parent;

    private Number level;

    private String category;

    private Number parentId;
}
