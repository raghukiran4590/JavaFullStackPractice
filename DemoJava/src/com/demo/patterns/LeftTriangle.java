package com.demo.patterns;

public class LeftTriangle {
	
public static void leftTriangle(int n) {
		
		int i,j,k;
		
		for (i=0; i<n;i++) {			
			
			for (j = 1; j<(n-i); j++) {
				System.out.print("  ");
			}
			for (k=0; k<=i; k++) {
				System.out.print(" "+k);
			}
			
			System.out.println();
		}		
}

	public static void main(String[] args) {
		
		leftTriangle(5);
		
	}
	
}
