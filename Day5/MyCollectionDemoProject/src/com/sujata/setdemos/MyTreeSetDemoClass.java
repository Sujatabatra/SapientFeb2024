package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * TreeSet is the Sorted Unique Autogrowable and Autoshrinkable
		 * collection of Objects
		 */
		Set<Integer> integerCollection=new TreeSet<Integer>();
		
		System.out.println("Size of integerCollection : "+integerCollection.size());
		
		integerCollection.add(Integer.valueOf(10));
		integerCollection.add(20);
		integerCollection.add(5);
		integerCollection.add(100);
		integerCollection.add(75);
		integerCollection.add(20);
		
		System.out.println("Size of integerCollection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.remove(5);
		System.out.println("Size of integerCollection : "+integerCollection.size());
		System.out.println(integerCollection);

		
		System.out.println("Traversal using for each");
		for(Integer element:integerCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=integerCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
