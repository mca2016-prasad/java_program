package com.jang;
import java.util.*;
public class FirstAndLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int digit = 0;
		int lastdigit = n % 10;
		for(int i = n; i > 0; i = i/10 ){
			digit = i % 10;
		}
		System.out.println(digit + " " +lastdigit);
		
	}
}
