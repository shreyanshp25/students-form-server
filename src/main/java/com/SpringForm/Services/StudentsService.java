package com.SpringForm.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringForm.Models.Students;
import com.SpringForm.Repository.JpaRepo;

@Service
public class StudentsService {
	@Autowired
	private JpaRepo repo;
	
	//post
	public Students postStudent(Students students){
		return repo.save(students);
	}
	//get
	public List<Students> getStudents(){
		return repo.findAll();
	}
//	//get by id
//	public Students getStudentById(int id) {
//		return repo.findById(id).orElse(null);
//	}
//	//get by name
//	public Students getStudentByName(String name) {
//		return repo.findByName(name);
//	}

}
