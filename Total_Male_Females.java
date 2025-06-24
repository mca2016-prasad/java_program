package com.jang.Total_males_females;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Total_Male_Females {

	public static void main(String[] args)
	{
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Male"),
                new Employee("Alice", "Female"),
                new Employee("Bob", "Male"),
                new Employee("Eva", "Female"),
                new Employee("Mark", "Male"),
                new Employee("Sophia", "Female")
        );

        // Count males and females using Java Streams
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        // Print total males and females
        System.out.println("Total Males: " + genderCount.getOrDefault("Male", 0L));
        System.out.println("Total Females: " + genderCount.getOrDefault("Female", 0L));
    }
}
