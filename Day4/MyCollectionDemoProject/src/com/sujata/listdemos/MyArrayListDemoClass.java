package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayListDemoClass {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Size of list : "+list.size());
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(100);
		list.add(10);
		
		System.out.println("Size of list : "+list.size());
		System.out.println(list);
		
		list.remove(2);
		list.remove(Integer.valueOf(5));
		System.out.println("Size of list : "+list.size());
		System.out.println(list);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<list.size();index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("Traversal using for each");
		for(Integer element:list) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<Integer> listIterator=list.listIterator();
		
		System.out.println("Reverse Traversal using List Iterator");
		while(listIterator.hasNext())
			listIterator.next();
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}

}
