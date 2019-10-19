	package org.capg.app;
	
	import java.util.Scanner;
	
	public class TaxCalculator
	{
		public static double calculateTax(String empName, boolean isIndian, double empSal) throws TaxCalculatorException 
		{
			double taxAmount;
			if (isIndian == false)
			{
				throw new TaxCalculatorException("CountryNotValidException");
			} 
			else if (empName.isEmpty())
			{
				throw new TaxCalculatorException("EmployeeNameInvalidException");
			} 
			else if (empSal > 100000 && isIndian == true) 
			{
				taxAmount = empSal * 8 / 100;
			} 
			else if (empSal > 50000 && empSal < 100000 && isIndian == true) 
			{
				taxAmount = empSal * 6 / 100;
			} 
			else if (empSal > 30000 && empSal < 50000 && isIndian == true)
			{
				taxAmount = empSal * 5 / 100;
	
			} 
			else if (empSal > 10000 && empSal < 30000 && isIndian == true) 
			{
				taxAmount = empSal * 4 / 100;
	
			} 
			else 
			{
				throw new TaxCalculatorException("TaxNotEligibleException");
			}
			
			return taxAmount;
	
		}
	
		public static void main(String[] args) throws TaxCalculatorException
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the employee name:");
			String empName = scanner.nextLine();
			System.out.println("enter whether the employee is Indian or not:");
			boolean isIndian = scanner.nextBoolean();
			System.out.println("enter the employee salary:");
			double empSal = scanner.nextDouble();
			calculateTax(empName, isIndian, empSal);
			System.out.println("Tax Amount is:" + " " + calculateTax(empName, isIndian, empSal));
	
		}
	}
