package com.springdemo1.springfmw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springdemo1.springfmw.dao.StudentRepo;
import com.springdemo1.springfmw.model.Student;

public class StudentService {
	
	//dependency injection
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getListFromStudentRepoClass(){
		return studentRepo.getMystudentlist();
	}

}
