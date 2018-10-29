package com.hendisantika.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class StudentSearchApplication {
	
	@Autowired
    DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(StudentSearchApplication.class, args);
	}


}
