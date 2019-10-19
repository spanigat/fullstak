package com.lamdaExpression;

import java.util.ArrayList;

public class RemoveOddNoFromList {
	public static void main(String[] args) {	
	ArrayList<Integer> no = new ArrayList<Integer>(); 
	  
    no.add(23); 
    no.add(32); 
    no.add(45); 
    no.add(63); 
    no.removeIf(n -> (n % 2 == 0)); 
    for (int i : no) { 
        System.out.println(i); 
    } 
} 
}
