package com.demo.array;

public class ReverseArray {	
	
	static char ar[] = {'j','a','r'};
	

	public static void main(String[] args) {	
		
		
		for (int i=0; i<ar.length; i++) {
			
			System.out.println(ar[i]);
			
		}
		
		System.out.println("					  ");
		System.out.println("**********************");
		System.out.println("					  ");
		
		for (int j = ar.length-1; j>=0; j--) {
			
			System.out.println(ar[j]);
			
		}

	}

}
