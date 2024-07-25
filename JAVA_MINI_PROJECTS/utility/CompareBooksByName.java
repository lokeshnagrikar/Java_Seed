package com.seed.library.utility;

import com.seed.library.Book;

import java.util.Comparator;

public class CompareBooksByName implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
//    	String b1 = book1.getName();
//    	String b2 = book2.getName();
    	
//        return b1.compareTo(b2);
    	return book1.getName().compareTo(book2.getName());
    }
}
