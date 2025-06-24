package com.jang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList 
{
	// HOW TO MAKE RAD ONLY ARRAYLIST IN JAVA?
    public static void main( String[] args )
    {
        List<String> list = new ArrayList<>();
                     list.add("A");
                     list.add("B");
                     list.add("C");
                     list.add("D");
                     
               List<String> readOnly = Collections.unmodifiableList(list);
                         
                          readOnly.add("F");
               System.out.println(readOnly);
    }
}
