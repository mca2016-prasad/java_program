package com.jang;
import java.util.*;
/**
 * Hello world!
 *
 */
public class ArmStrong 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	int i=1;
    	while(i<=n)
    	{
    		int num=i;
    		int sum=0;
    		while(num>0) {
    			int digit=num%10;
    			sum=sum+(digit*digit*digit);
    			num=num/10;
    		    		}
    		if(sum==i) {
    			System.out.println(i);
    		}
    		i++;
    	}
    }
}
//153  407  370 