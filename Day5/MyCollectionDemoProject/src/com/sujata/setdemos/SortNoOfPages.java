package com.sujata.setdemos;

import java.util.Comparator;

public class SortNoOfPages implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if(book1.equals(book2))
			return 0;
		else if(book1.getNoOfPages()>book2.getNoOfPages())
			return 1;
		else
			return -1;
	}

}
