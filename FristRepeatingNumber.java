package com.jang;

import java.util.HashSet;

public class FristRepeatingNumber {

	// Print firstrepeating no in the array
	//int arr[] = {3,9,5,9,10}
	//output:
	//First Repeating element is 9
	
	public static void main(String[] args)
	{
		int arr[]= {3,9,5,9,10};
		printFirstRepeating(arr);
	}
	
	public static void printFirstRepeating(int arr[])
	{
		int min =-1;// goes to first   element array
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<=arr.length-1; i++) // from 0 till taken -1
		{
			if(set.contains(arr[i]))
			{
				min = i; //elemetn present in array I sure first repet eml
				break;
			}
			else
			{
				set.add(arr[i]); // not repeat add element
			}
		}
		if(min !=-1) // I check no = -1
		{
			System.out.println("Repeating element: " + arr[min]);
		}
		else
		{
			System.out.println("No repeating element");
		}
		
		
		
	}
}
