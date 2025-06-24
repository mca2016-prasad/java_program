package com.jang;

import java.util.Arrays;
import java.util.List;

public class EvenNoNDouble {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(e->e%2==0).map(no->no*2).forEach(System.out::println);
	}

}
