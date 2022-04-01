package com.example.demo.dao;

import com.example.demo.entity.CategoriesDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesDAO extends MongoRepository<CategoriesDTO, String> {

}
