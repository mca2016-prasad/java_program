package com.jang;

import java.util.Scanner;

public class Detect_Special_chars_String {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check for special characters
        boolean hasSpecialChar = false;
        StringBuilder specialChars = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                hasSpecialChar = true;
                specialChars.append(ch).append(" ");
            }
        }

        // Output result
        if (hasSpecialChar) {
            System.out.println("Special characters found: " + specialChars);
        } else {
            System.out.println("No special characters found.");
        }
	}

}
