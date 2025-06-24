package com.jang;
import java.util.*;
public class OddAdd {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		    int num=sc.nextInt();
		    for(int i=0; i<=num; i++)
		    {
		    	if(i%2==0) {
		    		count += i;
		    		
		    	}
		    	
		    }
		    System.out.println(count);
		
		
	}
}
