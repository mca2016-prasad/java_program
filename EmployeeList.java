package com.jang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	
	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 120000),
            new Employee(2, "Bob", 95000),
            new Employee(3, "Charlie", 105000),
            new Employee(4, "David", 115000),
            new Employee(5, "Eve", 98000)
        );

        // Additional code to find top 3 highest-paid employees will go here
    
                // employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
	
                 System.out.println("================================");
	List<Employee> top3HighestPaid = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .limit(3)
            .collect(Collectors.toList());

        top3HighestPaid.forEach(System.out::println);
    }

}
