package com.SpringForm.Models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="studentsInfo")
@Getter
@Setter
public class Students {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate dob;
	private String clss;
	private int age;
	private String name;
	
	public Students() {
		
	}
	public Students(int id, String name, String clss, int age, LocalDate date) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.clss = clss;
		this.dob = date;
	}
	
	public Students(String name, String clss, int age, LocalDate date) {
		this.name = name;
		this.age = age;
		this.clss = clss;
		this.dob = date;
	}
	

}
