package com.demo.inheritance;

public class Employee {
	
	int id;
	String ename;
	String company;
	Address address;
	
	public Employee (int id, String ename, String company, Address address) {
		
		this.id = id;
		this.ename = ename;
		this.company = company;
		this.address = address;
		
	}
	
	public void displayEmployee() {
		
		System.out.println(this.id);
		System.out.println(this.ename);
		System.out.println(this.company);
		
		this.address.displayEmployeeAddress();
		
	}

	public static void main(String[] args) {
		
		Address address = new Address("Beechmill","Indy","IN");
		
		Employee emp = new Employee(10,"Raghu","AshokIT", address);
		
		emp.displayEmployee();
		

	}

}
