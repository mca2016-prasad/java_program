package com.jang.Remove_all_given_character;

import java.util.Scanner;

public class remove_all_occurrences {

	
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Input string and character to be removed
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);

        // Remove occurrences of the character
        String result = input.replace(String.valueOf(ch), "");    // removes all occurrences of the specified character.

        // Print the modified string
        System.out.println("String after removing '" + ch + "': " + result);
    }
}


/*
  Enter the string: jang 
  Enter the character to remove: n 
  String after removing 'n': jag
 
 */