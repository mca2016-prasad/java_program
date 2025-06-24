package com.jang.excepitonDemo;

public class SS {

	static int divideByZero(int a, int b)
	{
		int i=a/b;
		return i;
	}
	
	static int computeDivision(int a,int b)
	{
		int res=0;
		
			try
			{
				res=divideByZero(a,b);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Numbrformat is occured");
			}
			
			return res;
		
	}
	public static void main(String[] args) {
		
		int a =1;
		int b=0;
		
		try
		{
			int i=computeDivision(a, b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}
}
