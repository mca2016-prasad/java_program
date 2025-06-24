package com.jang.april_13;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintFirst_10_randomNumbers_infiniteSequence {

	public static void main(String[] args) {
		
		
		Random random = new Random();

        List<Integer> randomNumbers = Stream.generate(() -> random.nextInt(100)) // random numbers from 0 to 99
            .limit(10) // take only the first 10
            .collect(Collectors.toList());

        System.out.println("Random Numbers: " + randomNumbers);
    }
}