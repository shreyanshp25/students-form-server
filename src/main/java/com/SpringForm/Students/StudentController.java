package com.SpringForm.Students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringForm.Models.Students;
import com.SpringForm.Services.StudentsService;

@RestController

@RequestMapping("/srm")
public class StudentController {
	
	@Autowired
	private StudentsService studentService;
	
	@PostMapping("/student")
	public Students addStudent(@RequestBody Students student) {
		return studentService.postStudent(student);
	}
	
	@GetMapping("/student")
	public List<Students> getStudent(){
		return studentService.getStudents();
	}
}
