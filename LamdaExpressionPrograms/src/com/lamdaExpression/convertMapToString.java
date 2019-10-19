package com.lamdaExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class convertMapToString {
	 public static void main(String[] args) throws Exception {
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "foo");
	        map.put(2, "bar");
	        map.put(3, "baz");
	       
	         String result=map.entrySet()
	            .stream()
	            .map(entry -> entry.getKey()  + entry.getValue())
	            .collect(Collectors.joining(","));
	         StringBuffer s=new StringBuffer(result);
	        System.out.println(s);
	    }
}
