package com.jang;
import java.util.*;

public class ArmStrong2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		while (i <= n)
		{ 
			int num = i; 
			int x = 0; 
			while (num> 0)
			{
				int m = num % 10 ; 
				x = x + (m*m*m);
				num = num/10;
				 //System.out.println(x);
				}
			if (i == x)
			{
				System.out.println(x); 
				} 
			
			i++ ; 
			}
			}
		
	}

