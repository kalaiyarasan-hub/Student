package com.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.customexception.AgeInvalidException;
import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String setStudent(Student s) {
		return sd.setStudent(s);

	}

	public String setAllStudent(List<Student> s) throws AgeInvalidException {
		List<Student> y = s.stream().filter(x -> x.getAge() < 18).collect(Collectors.toList());
		
		if (y.isEmpty()) {
		
			return sd.setAllStudent(s);
		} 
		else {
			throw new AgeInvalidException("not eligible");
		
		}

	}

	public List<Student> getAllStudent() {

		return sd.getAllStudent();
	}

}
