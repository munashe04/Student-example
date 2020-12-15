package com.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
 @Autowired
 private StudentServImpl studentServImpl;
	
	@PostMapping
	public Student addStudent(@RequestBody Student Student) {
		return studentServImpl.saveStudent(Student);
	}

}
