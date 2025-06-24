package com.jang.excepitonDemo;

public class B {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e.toString());
			System.out.println(e.getMessage()); //3. getMessage():=>The getMessage() method prints only the description of the exception.
			
			/*
			 toString() 
			 The toString() method prints exception information in the format of the Name of the exception: 
				 description of the exception.
				 
				 */
		}
	}
}
