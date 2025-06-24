package com.jang;
import java.util.*;

public class PrimeNum {
 
	public static void main(String[] args) {
		  
		Scanner scn = new Scanner(System.in);
		 
		 int n = scn.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			//check and print if 'i'  is prime number
			int count=0;
			for(int num=1; num<=i; num++)
			{
				if(i % num==0)
				{
					count++;
				}
				if(count>2)
				{
					break;
				}
			}
		
		if(count==2)
		{
			System.out.println(i);
		}
		 
		}
	}
}



