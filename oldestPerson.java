package com.jang.get_first_name_oldest_person;

import java.util.Arrays;
import java.util.List;

public class oldestPerson {
	
	
	private String firstName;
    private String lastName;
    private int age;

    public oldestPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
    	return age;

}

}
