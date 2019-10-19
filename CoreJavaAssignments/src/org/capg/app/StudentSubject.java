package org.capg.app;

import java.util.Scanner;

public class StudentSubject {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 subject marks");
		int sub1=s.nextInt();
		int sub2=s.nextInt();
		int sub3=s.nextInt();
		
		
		if(sub1>60 && sub2>60 && sub3>60){
			System.out.println("Passed");
		}
		
	else if((sub1>60 || sub2>60) && (sub1>60 || sub3>60) && (sub2>60 || sub3>60) ){
			System.out.println("Promoted");
			
		}
		else if((sub1<60 && sub2<60 && sub3<60) || sub1>60 || sub2>60 || sub3 >60){
			System.out.println("failed");
		}
	}

	
}
