package com.example.demo.dao;

import com.example.demo.entity.SanPhamDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SanPhamDAO extends MongoRepository<SanPhamDTO, Object> {

}
