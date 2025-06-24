package com.jang;
import java.util.*;
public class PerfectNum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        
        //Is it perfect?
        int t = scn.nextInt();//number of test cases
        
        while(t > 0){
            //work
           int n = scn.nextInt();
           
           int sum = 0;
           for(int i = 1; i < n; i++){
               if(n%i == 0){
                   sum = sum + i;
               }
           } 
            
            if(sum == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            
            t--;
        }
	}
}
