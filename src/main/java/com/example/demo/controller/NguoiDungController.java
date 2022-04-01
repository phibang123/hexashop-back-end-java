package com.example.demo.controller;

import com.example.demo.entity.NguoiDungDTO;
import com.example.demo.service.NguoiDungService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@RequestMapping("/NguoiDung")
public class NguoiDungController {

    @Autowired
    private  NguoiDungService nguoiDungService;


    @GetMapping()
    public List<NguoiDungDTO> fetchAllNguoiDung(){
        return nguoiDungService.getAllStudent();
    }
}
