package org.capg.app;

import java.util.Scanner;

public class IncomeTax {
	 double incomeTax;
	 double empSal;

	public  double calculateITax(double empSal) {
		if (empSal > 0 && empSal < 180000) {
			incomeTax = 0;
		}
		else if (empSal > 181001 && empSal < 300000){ 
			incomeTax = (empSal )* 0.1;
		}
		else if (empSal > 300001 && empSal < 500000) 
		{	incomeTax = (empSal) *0.2;}
		else if (empSal > 500001 && empSal < 1000000) 
			{incomeTax = (empSal )*0.3;}
           return incomeTax;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employee salary");
		double empSal = scanner.nextDouble();
		IncomeTax incomeTax=new IncomeTax();
		System.out.println("income tax is :"+incomeTax.calculateITax(empSal));
	}
}