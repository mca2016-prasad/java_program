package com.jang;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		
		String str="aabbbcc";
		
		// count a2b3
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
			
		{
			char ch =str.charAt(i);
			if(map.containsKey(ch))
			{
				 int count =  map.get(ch);
				 count++;
				 map.replace(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}
		}

		 for(Character ch:map.keySet())
		 {
			 System.out.println(ch+" ="+map.get(ch));
		 }

		
		
		
		
		
		
	}
	
}
