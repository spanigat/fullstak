package org.capg.app;

import java.util.Scanner;

public class FindNoInGienArray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter no to find");
	int[] num = { 5, 12, 14, 6, 78, 19, 1, 23, 19, 35, 37, 7, 52, 86, 47 };
	int toFind = s.nextInt();
	boolean found = false;
	for (int n : num) {
		if (n == toFind) {
			found = true;
			break;
		}
	}
	if (found)
		System.out.println(toFind + " is found.");
	else
		System.out.println(toFind + " is not found.");
}
}
