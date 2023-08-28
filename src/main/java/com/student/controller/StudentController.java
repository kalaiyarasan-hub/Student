package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.customexception.AgeInvalidException;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;

	@PostMapping(value = "/setStudent")
	public String setStudent(@RequestBody Student s) {
		return ss.setStudent(s);

	}
	@PostMapping(value="/setAllStudent")
	public String setAllStudent(@RequestBody List<Student> s) throws AgeInvalidException {
		return ss.setAllStudent(s);
		
	}
	@GetMapping(value="/getAllStudent")
	public List<Student>getAllStudent(){
		return ss.getAllStudent();
		
	}

}
