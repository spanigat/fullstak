package org.capg.app;

import java.util.Date;

public class DateClassExample
{
	int date;
	int month;
	int year;
	static int tempDate;
	 
	public DateClassExample()
	{
		super();
	}

	public DateClassExample(int date, int month, int year)
	{
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	
	public int getDate() 
	{
		return date;
	}

	public void setDate(int date)
	{
		this.date = date;
	}

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public static void displayDate()
	{
		Date date1= new Date();
		System.out.println("Today's date :"+ date1);
		Date date2 = new Date();
		System.out.println("Todays date :"+ date2);
	}

	public static void main(String[] args) 
	{
	

		displayDate();
		
	}
	
}
