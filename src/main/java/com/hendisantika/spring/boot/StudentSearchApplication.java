package com.hendisantika.spring.boot;

import com.hendisantika.spring.boot.model.Student;
import com.hendisantika.spring.boot.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class StudentSearchApplication {
	
	@Autowired
    DataSource dataSource;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StudentSearchApplication.class, args);
	}


}
