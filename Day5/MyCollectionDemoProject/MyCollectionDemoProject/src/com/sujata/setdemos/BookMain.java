package com.sujata.setdemos;

public class BookMain {

	public static void main(String[] args) {
		Book book1=new Book(101, "BOOK1", "AAA", 340, 500);

		Book book2=new Book(101, "BOOK1", "AAA", 340, 500);
	
		if(book1.equals(book2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		
		System.out.println("Book1 hashcode "+book1.hashCode());
		System.out.println("Book2 hashcode "+book2.hashCode());
	}

}
