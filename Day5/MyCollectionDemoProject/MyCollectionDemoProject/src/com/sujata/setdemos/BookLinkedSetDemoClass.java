package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BookLinkedSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the Unordered Unique Autogrowable and Autoshrinkable
		 * collection of Objects
		 */
		Set<Book> bookCollection=new LinkedHashSet<Book>();
		
		System.out.println("Size of integerCollection : "+bookCollection.size());
		
		bookCollection.add(new Book(101, "Book1", "Author A", 350, 500));
		bookCollection.add(new Book(102, "Book2", "Author V", 1350, 5100));
		bookCollection.add(new Book(103, "Book3", "Author B", 2350, 1900));
		bookCollection.add(new Book(104, "Book4", "Author A", 5650, 700));
		bookCollection.add(new Book(105, "Book5", "Author A", 650, 800));
		bookCollection.add(new Book(101, "Book1", "Author A", 350, 500));
		System.out.println("Size of integerCollection : "+bookCollection.size());
		System.out.println(bookCollection);
		
		bookCollection.remove(new Book(103, "Book3", "Author B", 2350, 1900));
		System.out.println("Size of integerCollection : "+bookCollection.size());
		System.out.println(bookCollection);

		
		System.out.println("Traversal using for each");
		for(Book element:bookCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Book> iterator=bookCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
