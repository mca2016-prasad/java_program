package com.jang.array;

import java.util.Map;
import java.util.stream.Collectors;

public class FindVowelUsingString {
	public static void main(String[] args) {
		
		String str ="hello event";   
		
Map<String, Long> m =		str.chars().mapToObj(x->(char)x).
		collect(Collectors.groupingBy(Object:: toString, 
				 Collectors.counting()));
		
       m.forEach((k, v)->System.out.println(k + "  "+v)); // Count space and chars
		//System.out.println(m);
		
			
		
		
		
		
	long v =	str.chars().filter((e)-> {
			return (e=='a' || e=='e' ||e=='i' || e=='o' || e=='u');
			
		}).distinct().count();
	
	
	System.out.println(v);
	}
          
	
	
}
