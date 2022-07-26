package com.demo.string;

public class AccountID {

	public static void main(String[] args) {
		String domain_id = "341069927031.us-east-2.awsdns.internal.das";
		
		//String account_id = domain_id.substring(0, domain_id.indexOf('.'));
		
		
		if ( Character.isDigit(domain_id.charAt(0)) )
		{
		    System.out.println("String begins with a digit");
		    domain_id = domain_id.substring(domain_id.indexOf('.')+1,domain_id.length()) ;
		}
		
		System.out.println(domain_id);

	}

}
