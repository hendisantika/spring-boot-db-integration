package com.hendisantika.spring.boot.service;

import com.hendisantika.spring.boot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Find all students, By Java 8 we can create a custom RowMapper 
	public List<Student> findAll() {

//		List<Student> result = jdbcTemplate.query("SELECT studentId, firstName,lastName, email FROM student",
		List<Student> result = jdbcTemplate.query("SELECT student_id, first_name,last_name, email FROM student",
//				(rs, rowNum) -> new Student(rs.getInt("studentId"), rs.getString("firstName"), rs.getString("lastName"),
				(rs, rowNum) -> new Student(rs.getInt("student_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email")));
		return result;
	}
}
