package com.example.demo.controller;

import com.example.demo.entity.CategoriesDTO;
import com.example.demo.service.CategoriesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoriesController {

    private final CategoriesService categoriesService;




    @GetMapping()
    public List<CategoriesDTO> fetchAllCategories(){
        return categoriesService.getAllCategories();
    }
}
