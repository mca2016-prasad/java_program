package com.jang;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		    int A=sc.nextInt();  
		    int B=sc.nextInt();  
		    
		    int ans=1; // 0 not initialization because multiply will zero
		    
		    for(int i=1; i<=B; i++)
		    {
		    	ans=ans*A;
		    }
		    System.out.println(ans);
	}
}
