package com.jang;
import java.util.*;
public class Test_1 {

	public static void main(String[] args) {
		

		/*
		 * int i = 0; for(i = 0; i < 5; i++) { } System.out.print(i + " ");
		 */
	         
	         
	         
	         
				/*
				 * for(int ii = 10; ii <= 5; ii--) { System.out.print(ii + " "); }
				 */
	     
				/*
				 * for(int a = 1; a <= 10; a++) { System.out.print(a++ + " "); }
				 * 
				 */
		Scanner scn = new Scanner(System.in);
	
        int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++){
			arr[i] = scn.nextInt();
		}
		for(int i = 0; i < 5; i++){
			System.out.print(arr[i]+", ");
		}
		
		//int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 5; i++){
			System.out.print(arr[i]+", ");
		}
}}
