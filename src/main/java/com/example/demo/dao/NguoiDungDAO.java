package com.example.demo.dao;


import com.example.demo.entity.NguoiDungDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungDAO extends MongoRepository<NguoiDungDTO, String> {

}
