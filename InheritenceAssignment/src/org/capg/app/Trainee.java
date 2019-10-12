package org.capg.app;

public class Trainee extends Employee
{

	public Trainee(long employeeId, String employeeName,
			String employeeAddress, long empPhone, double salary) 
	{
		super(employeeId, employeeName, employeeAddress, empPhone);
		this.basicSalary = salary;
	}

	
}
