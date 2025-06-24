package com.jang;
import java.util.*;

public class Lcm {
 
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		 int a = scn.nextInt();
	        int b = scn.nextInt();
	        
	        int max = 0;
	        if(a > b)  // use for maximum value
	        {
	            max = a;
	        }
	        else
	        {
	            max = b;
	        }
	        int lcm = 0;
	        int i = max;
	        while(true)
	        {
	            if(i% a == 0 && i % b == 0)
	            {
	                lcm = i;
	                break;
	            }
	            i = i+max;
	        }
	        System.out.println(lcm);
	}
}
/*
a = 2
b = 7
max = 7
lcm = 0
i   i%2 == 0 && i % 7 == 0      lcm     i=i+max
7   false                        -       7+7 = 14
14  true                         14 --------> break
*/




