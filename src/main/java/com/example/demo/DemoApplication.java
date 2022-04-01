package com.example.demo;

import com.example.demo.dao.CategoriesDAO;
import com.example.demo.entity.CategoriesDTO;
import com.example.demo.entity.NguoiDungDTO;
import com.example.demo.dao.NguoiDungDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}
//	@Bean
//	CommandLineRunner runner(CategoriesDAO reponsitory){
//         return args ->
//		 {
//			 CategoriesDTO categories = new CategoriesDTO(
//					 "asasa",
//					 212122,
//					 "Bang",
//					 "ASASAS",
//					 "ASASAS",
//					 121212,
//					 "SASAS",
//					 2121212
//			 );
//			 reponsitory.insert(categories);
//		 };
//	}
}
