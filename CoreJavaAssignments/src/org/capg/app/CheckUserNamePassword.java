package org.capg.app;

import java.util.Scanner;

public class CheckUserNamePassword {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String user="Shilpa";
	String Password="panigatti";
	int MaxAttempt=0;
	while(MaxAttempt<=2){
		System.out.println("Enter username");
		String username=s.next();
		System.out.println("Enter Password");
		String pwd=s.next();
		if(username.equals(user) && Password.equals(pwd)){
			System.out.println("Welcome to " + user);
		}
		else
			System.out.println("Invalid user");
		
	}
	if(MaxAttempt>2){
		System.out.println("Contact Admin");
	}
}
}
