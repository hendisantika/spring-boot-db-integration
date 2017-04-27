package com.hendisantika.spring.boot.api;

import com.hendisantika.spring.boot.model.Student;
import com.hendisantika.spring.boot.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentAPI {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping("/students")
	public List<Student> searchStudent() {
		List<Student> students = studentRepository.findAll();
		return students;
	}
}
