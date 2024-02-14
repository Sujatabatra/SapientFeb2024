package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * Unordered collection of key value pair of objects.
		 * Unordering wrt key
		 */
		
		Map<String, Integer> months=new HashMap<String, Integer>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		months.put("Jun", 30);
		
		System.out.println("Size of Months : "+months.size());
		System.out.println(months);
		
		months.put("Feb", 29);
		System.out.println("Size of Months : "+months.size());
		System.out.println(months);

		Set<String> monthsName=months.keySet();
		
		for(String monthName:monthsName) {
			System.out.println(monthName+" have "+months.get(monthName)+" days");
		}
		
		
	}

}
