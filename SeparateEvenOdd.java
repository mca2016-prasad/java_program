package com.jang;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenOdd {

	
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);

        // Partition the list into even and odd numbers
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
            .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> evenNumbers = partitionedNumbers.get(true);
        List<Integer> oddNumbers = partitionedNumbers.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}


/*
Explanation:

numbers.stream(): Converts the list of numbers into a stream.
.collect(Collectors.partitioningBy(num -> num % 2 == 0)): Partitions the stream into a Map based on the predicate num -> num % 2 == 0,
 where the key true corresponds to even numbers and false to odd numbers.
partitionedNumbers.get(true): Retrieves the list of even numbers.
partitionedNumbers.get(false): Retrieves the list of odd numbers.
*/
