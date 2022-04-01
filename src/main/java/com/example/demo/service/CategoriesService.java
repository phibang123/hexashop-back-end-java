package com.example.demo.service;

import com.example.demo.dao.CategoriesDAO;
import com.example.demo.entity.CategoriesDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriesService {
    private final CategoriesDAO categoriesDAO;




    public List<CategoriesDTO> getAllCategories(){
        return categoriesDAO.findAll();
    }
}
