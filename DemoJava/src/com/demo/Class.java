package com.demo;

import java.lang.reflect.Method;

public class Class {

	public static void main(String[] args) {
		Class cl = new Class();
		
		Method m[];
		
		System.out.println(cl.getClass());
		
		System.out.println(cl.getClass().getName());
		
		System.out.println(cl.getClass().getCanonicalName());
		
		System.out.println(cl.getClass().isInstance(cl));
		
		System.out.println(cl.getClass().isInterface());
		
		System.out.println(cl.getClass().getPackage());
		
		m = cl.getClass().getDeclaredMethods();
		
		System.out.println(m.length);
		
		for (int i = 0; i<m.length; i++) {
			
			System.out.println(m[i]);
			
		}

	}

}
