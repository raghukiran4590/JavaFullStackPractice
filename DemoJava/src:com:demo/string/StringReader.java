package com.demo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number: ");
		
		int bs = Integer.parseInt(br.readLine());
		
		System.out.println(bs);
		
		System.out.print("Enter the Number String: ");
		
		Scanner sc = new Scanner(System.in);
		
		int str = Integer.parseInt(sc.nextLine());
		
		System.out.println(str);
		
		System.out.println("Sum of both the String numbers: "+ (bs+str));
		
		
		

	}

}
