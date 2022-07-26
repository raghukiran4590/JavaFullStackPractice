package com.demo.inheritance;

public class Address {
	
	String street;
	String city;
	String state;
	
	public Address(String street, String city, String state) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		
	}
	
	public void displayEmployeeAddress() {
		
		System.out.println(this.street);
		System.out.println(this.city);
		System.out.println(this.state);
		
	}

}
