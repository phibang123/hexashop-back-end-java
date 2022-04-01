package com.example.demo.service;

import com.example.demo.dao.NguoiDungDAO;
import com.example.demo.entity.NguoiDungDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NguoiDungService {
    private  NguoiDungDAO nguoiDungRepository;


    public List<NguoiDungDTO>  getAllStudent(){
        return nguoiDungRepository.findAll();
    }
}

