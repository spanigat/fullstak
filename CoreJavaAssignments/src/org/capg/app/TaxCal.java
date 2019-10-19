package org.capg.app;

import java.util.Scanner;

public class TaxCal {
public static void main(String[] args) {
	String user="Shilpa";
	String password="shilpa";
	int maxLimit=0;
	while(maxLimit<3){
		Scanner s=new Scanner(System.in);
		System.out.println("enter user name");
		String username=s.next();
		System.out.println("enter password");
	    String pwd=s.next();	
	    if(username.equals(user) && pwd.equals(password)){
	    	System.out.println("Valid user");
	    }
	    else{
	    	System.out.println("invalid user");
	    }
	    maxLimit++;
	}
	if(maxLimit>=3)
	{
		System.out.println("Contact Admin");
	}
}
}
