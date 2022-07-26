package com.demo.aggregation;

import java.util.List;

public class Department {

	String deptname;
	List<Student> students;
	
	public Department (String deptname, List<Student> students) {
		
		this.deptname = deptname;
		this.students = students;
		
	}
	
	public List<Student> returnStudents(){
		
		return this.students;
		
	}

}
