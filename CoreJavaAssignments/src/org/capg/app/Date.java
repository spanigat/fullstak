package org.capg.app;

public class Date {
	 private int day;
	 private String month;
	 private int year;
	 
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
		super();
	}
	public void printDate()
	{
		System.out.println("date is"+" "+day+"--"+month+"--"+year);
	}
	public void swapDate(Date dv,Date dv1)
	{
	Date temp= dv;
	dv=dv1;
	dv1=temp;
	 dv.printDate();
     dv1.printDate();
	}
	
	public static void main(String[] args) 
	{
     Date dv =new Date(14,"aug",1963);
     dv.printDate();
     Date dv1=new Date(27,"june",2019); 
     dv1.printDate();  
    System.out.println("the swapped dates are:");
     dv.swapDate(dv, dv1);
    
	}

	
}
