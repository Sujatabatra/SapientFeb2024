package com.sujata.setdemos;

import java.util.HashSet;
//import com.sujata.beans.Book;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the Unordered Unique Autogrowable and Autoshrinkable
		 * collection of Objects
		 */
		Set<com.sujata.beans.Book> bookCollection=new TreeSet<com.sujata.beans.Book>();
		
		System.out.println("Size of integerCollection : "+bookCollection.size());
		
		bookCollection.add(new com.sujata.beans.Book(101, "Book1", "Author A", 350, 500));
		bookCollection.add(new com.sujata.beans.Book(102, "Book2", "Author V", 350, 5100));
		bookCollection.add(new com.sujata.beans.Book(103, "Book3", "Author B", 2350, 1900));
		bookCollection.add(new com.sujata.beans.Book(104, "Book4", "Author A", 5650, 700));
		bookCollection.add(new com.sujata.beans.Book(105, "Book5", "Author A", 650, 800));
		bookCollection.add(new com.sujata.beans.Book(101, "Book1", "Author A", 350, 500));
		System.out.println("Size of integerCollection : "+bookCollection.size());
		System.out.println(bookCollection);
		
		bookCollection.remove(new com.sujata.beans.Book(103, "Book3", "Author B", 2350, 1900));
		System.out.println("Size of integerCollection : "+bookCollection.size());
		System.out.println(bookCollection);

		
		System.out.println("Traversal using for each");
		for(com.sujata.beans.Book element:bookCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<com.sujata.beans.Book> iterator=bookCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
