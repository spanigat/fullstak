package org.capg.app;

public class Employee 
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long empPhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	double transportAllowance;
	
	public Employee(long employeeId, String employeeName,
			String employeeAddress, long empPhone)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.empPhone = empPhone;
	}
	
	public void calculateSalary()
	{
	  double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
	  System.out.println("The total Salary is " + salary);
	}
	
	public void calculateTransportAllowance ()
	{
		transportAllowance = 10*basicSalary/100;
		System.out.println("The Basic Transport Allowance is " + transportAllowance);
	}
}
