package com.jang;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Number_Starting_from_1 
{
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 12, 25, 32, 145, 19, 56, 17, 100, 10);

        // Find numbers starting with '1'
        List<Integer> result = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Numbers starting with 1: " + result);
    }
}
