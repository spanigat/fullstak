package org.capg.app;

public class Manager extends Employee
{

	
	public Manager(long employeeId, String employeeName,
			String employeeAddress, long empPhone, double salary)
	{
		super(employeeId, employeeName, employeeAddress, empPhone);
		
		this.basicSalary= salary;
	}
	
	public void calculateTransportAllowance ()
	{
		transportAllowance = 15*basicSalary /100;
		System.out.println("The Basic Transport Allowance for manager is " + transportAllowance);
	}
	
}
