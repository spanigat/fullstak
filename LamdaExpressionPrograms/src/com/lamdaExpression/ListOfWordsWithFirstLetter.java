package com.lamdaExpression;

public class ListOfWordsWithFirstLetter {
//    static String firstLetterWord(String str)  
//    { 
//        String result = ""; 
//        boolean v = true; 
//        for (int i = 0; i < str.length(); i++)  
//        { 
//            if (str.charAt(i) == ' ')  
//            { 
//                v = true; 
//            }  
//              
//            else if (str.charAt(i) != ' ' && v == true)  
//            { 
//                result += (str.charAt(i)); 
//                v = false; 
//            } 
//        } 
//  
//        return result; 
//    } 
//  
//    public static void main(String[] args)  
//    { 
//        String str = "geeks for geeks"; 
//        System.out.println(firstLetterWord(str)); 
//    }
	
	private static StringBuilder charBuffer = new StringBuilder(); 
    
	   public static String processWords(String input)  
	   { 
	        String s[] = input.split("(\\s)+"); 
	          
	        for(String values : s)  
	        { 
	            charBuffer.append(values.charAt(0)); 
	            System.out.println(charBuffer);
	        } 
	          System.out.println("String containing 1st letter from words");
	      return charBuffer.toString(); 
	   } 
	     
	   // main function 
	   public static void main (String[] args)  
	   { 
	      String input = "My name is shilpa panigatti"; 
	      System.out.println(processWords(input)); 
	   } 
}
