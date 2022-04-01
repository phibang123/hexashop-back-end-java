package com.example.demo.dao;

import com.example.demo.entity.LichSuMuaHangDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LichSuMuaHangDAO extends MongoRepository<LichSuMuaHangDTO, Object> {
}
