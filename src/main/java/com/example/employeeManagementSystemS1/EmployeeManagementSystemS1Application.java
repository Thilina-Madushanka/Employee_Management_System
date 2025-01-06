package com.example.employeeManagementSystemS1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementSystemS1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemS1Application.class, args);
	}
	//import model mapper after insert dependencies
	@Bean
	public ModelMapper modelMapper( ){
		return new ModelMapper();
	}
}
