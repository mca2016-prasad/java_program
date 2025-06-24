package com.jang;

import java.util.Arrays;
import java.util.List;

public class skip5NumberAfterPrint {


	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        // Skip the first 5 elements and print the rest
        numbers.stream()
               .skip(5)
               .forEach(System.out::println);
    }
}
