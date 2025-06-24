package com.jang.array;

import java.util.Stack;

public class ReverseStringWithStack {

	public static void main(String[] args) {
		
		
		String str="Delhi";
		
		Stack<Character> stack  = new Stack<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			stack.push(ch);
		}
		
		//System.out.println("Reverse of String"+ stack.pop());
		
		while(!stack.empty())
		{
			System.out.print(stack.pop());
		}
		
		
		
		

	}

}
