package com.demo.aggregation;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Student> stu = new ArrayList<Student>();
		List<Department> dept = new ArrayList<Department>();
		
		Student s1 = new Student("1", "Raghu", "CSE");
		Student s2 = new Student("2", "Ramu", "CSE");
		Student s3 = new Student("3", "Raju", "CSE");
		Student s4 = new Student("4", "Rakesh", "EEE");
		
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		
		Department d = new Department("CSE", stu);
		
		dept.add(d);
		
		Institute ins = new Institute("AshokIT", dept);
		
		System.out.println(ins.getStudentCount());

	}

}
