package com.jang.list;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args)
	{
		List<Emp> list = getList();
		
		
		
	  Map<Integer, Emp> l = list.stream().collect(Collectors.toMap(Emp::getId, e->e)); //Convert LIST TO MAP
		
		System.out.println(l.entrySet());
		
		// SECOND RULE 
	/*	Map<Integer,String>map= new HashMap<>();
		
		for(Emp e:list)
		{
			map.put(e.getId(), e.getName());
			
		}
		
		System.out.println(map);
		*/
		
		
		
		
		
		
		
		
		
	}
	
	public static List<Emp> getList()
	{
		List<Emp> list = List.of(
				new Emp(1,"A","hr",36,500.3,"female"),
				new Emp(3,"B","sales",25,100.2,"male"),
				new Emp(4,"C","manager",38,600.3,"female"),
				new Emp(2,"E","hr",52,50.56,"male")	
				);
		return list;
		//int ,s,s,i,d,s
	}
}
