package com.jang;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValues {


	public static void main(String[] args) {
        List<String> listWithNulls = Arrays.asList("Apple", null, "Banana", null, "Cherry");
        
        List<String> listWithoutNulls = listWithNulls.stream()
                                                     .filter(Objects::nonNull)
                                                     .collect(Collectors.toList());
        System.out.println(listWithoutNulls);
        
        
                  
        
        
        
        
    }
}