package com.lamdaExpression;

import java.util.ArrayList;

public class RemoveOddLength {
	 public static void removeEvenLength(ArrayList <String> stringList){
	        for(int i=0;i<stringList.size();i++){
	            String word=stringList.get(i);
	            if(word.length()%2==0){//even
	                //stringList.remove(word);
	                stringList.removeIf(n->n.length()%2 == 0);
	                i = i-1;
	                continue;
	            }
	        }

	        for(int i=0;i<stringList.size();i++){
	            String word=stringList.get(i);
	            System.out.println(word);
	        }
	    }

	public static void main(String []args)
	{
	    ArrayList <String> stringList = new ArrayList <String>();
	    stringList.add("this");
	    stringList.add("iso");
	    stringList.add("shilp");
	    stringList.add("test");
	    removeEvenLength(stringList);
	}
}
