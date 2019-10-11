package com.app;


import java.util.*;


public class ContactList {

public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	

		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		Scanner s=new Scanner(System.in);
		
		
		
		 boolean quit = false;
	        int choice = 0;
	        printInstructions();
	        while (!quit) {
	            System.out.println("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 0:
	                    printInstructions();
	                    break;
	                case 1:
	                	System.out.println("Please enter how many details you want to add");
	            		System.out.println("-----------");
	            		Integer n=s.nextInt();
	            		for(int i=0;i<n;i++){
	            			System.out.println("Enter contact no");
	            			Integer a=s.nextInt();
	            			System.out.println("Enter contact name");
	            			String b=s.next();
	            			hm.put(a,b);			
	            		}
	                    break;
	                case 2:
	                	System.out.println("Total size of the contact list");
	            		System.out.println(hm.size());
	                    break;
	                case 3:
	                	System.out.println("Enter no");
	            		Integer x=s.nextInt();
	            		System.out.println("Enter name");
	            		String y=s.next();
	            		hm.remove(x, y);
	            		System.out.println("After removing data from contact list");
	            		for(Map.Entry m:hm.entrySet()){
	            			System.out.println(m.getKey() + " " +m.getValue());
	            		}
	                    break;
	                case 4:
	                	for(Map.Entry m:hm.entrySet()){
	            			System.out.println(m.getKey() + " " +m.getValue());
	            		}
	                	break;
	                case 5:
	                System.out.println("Search key in contact list");
	                Integer a=s.nextInt();
	                if(hm.containsKey(a)){
	                	System.out.println("yes search key present in list" + " " + a);
	                }
	                else
	                	System.out.println("ket is not present in list");
	                break;
	                case 6:
	                    quit = true;
	                    break;
	            }
	        }
		
		
	}
private static void printInstructions() {
	 System.out.println("\nPress ");
     System.out.println("\t 0 to print the choice options");
     System.out.println("\t 1 to add an item to the list");
     System.out.println("\t 2 to get size of list");
     System.out.println("\t 3 to remove an item from the list");
     System.out.println("\t 4 to print the contact list");
     System.out.println("\t 5 to search key the contact list");
     System.out.println("\t 6 to quit the application");
}
}


