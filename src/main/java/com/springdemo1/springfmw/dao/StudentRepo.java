package com.springdemo1.springfmw.dao;

import java.util.ArrayList;
import java.util.List;

import com.springdemo1.springfmw.model.Student;

public class StudentRepo {
	
	static final List<Student> myStudentList = new ArrayList<Student>() {{
		add(new Student("Saroj", 28));
		add(new Student("Akhil", 23));
		add(new Student("paras", 32));
	}};

	public static List<Student> getMystudentlist() {
		return myStudentList;
	}
	
	

}
