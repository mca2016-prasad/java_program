package com.jang;
import java.util.*;
public class BankIssue {
public static void main(String[] args) {
	

	Scanner scn = new Scanner(System.in); 
	long totalAmount = scn.nextLong(); 
	int t = scn.nextInt();
	//number of test cases 
	long m = totalAmount; 
	while(t > 0)
	{ 
		long digit = scn.nextLong();
		long ops = scn.nextLong(); 
		if(digit == 1)
		{
			m = m + ops; 
			System.out.println(m); 
	} 
		if (digit ==2)
		{ 
			m = m - ops; 
			if (m < 0)
			{ 
				System.out.println("Insufficient Funds");
				m=m + ops;
				}
			else 
				System.out.println(m);
			} 
		t--; 
		}
}
}