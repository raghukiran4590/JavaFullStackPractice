package com.demo.aggregation;

import java.util.List;

public class Institute {
	
	String ins;
	List<Department> departments;
	
	public Institute(String ins, List<Department> departments) {
		
		this.ins = ins;
		this.departments = departments;
		
	}
	
	public int getStudentCount() {
		
		int count = 0;
		List<Student> students;
		
		for (Department d : departments) {
			
			students = d.returnStudents();
			
				for (Student s : students) {
					count++;		
				}
		}
		
		
		return count;
		
	}

}
