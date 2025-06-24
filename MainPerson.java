package com.jang.get_first_name_oldest_person;

import java.util.Arrays;
import java.util.List;

public class MainPerson {

    public static void main(String[] args) {
        List<oldestPerson> people = Arrays.asList(
            new oldestPerson("John", "Doe", 45),
            new oldestPerson("Alice", "Smith", 50),
            new oldestPerson("Bob", "Johnson", 35),
            new oldestPerson("Emily", "Davis", 60)
        );

        // Find the oldest person
        String oldestPersonName = people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .map(oldestPerson::getFirstName)
                .orElse("No person found");

        System.out.println("The oldest person's first name is: " + oldestPersonName);
    }
}

/*
Explanation:

stream() is used to iterate through the list.
max() compares the ages and finds the oldest person.
map() extracts the first name of the oldest person.
orElse() handles cases where the list is empty.
*/

