package org.capg.app;

public class InheritenceActivity 
{
	public static void main(String[] args) 
	{
		
	
		Manager manager = new Manager(126534, "Peter", "chennai India", 237844, 65000);
		manager.calculateSalary();
		manager.calculateTransportAllowance ();
		
		Trainee trainee = new Trainee(29846, "Jack","Mumbai India",442085,45000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance ();
	}
}
