package com.jang;
import java.util.*;
public class CountDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt(); // number given
		while(t>0)
		{
			int n=sc.nextInt();  // number given
			int count=0;
			if(n==0)
			{
			count =1;
					}
			while(n>0)
			{
				n=n/10;
				count ++;
				
			}
			System.out.println(count);
			t--;
				}
		
		}
}
