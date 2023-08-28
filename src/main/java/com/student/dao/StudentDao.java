package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;

	public String setStudent(Student s) {
		sr.save(s);
		return "saved";

	}

	public String setAllStudent(List<Student> s) {
		sr.saveAll(s);
		return "Successful";
	}

	public List<Student> getAllStudent() {

		return sr.findAll();
	}
}
