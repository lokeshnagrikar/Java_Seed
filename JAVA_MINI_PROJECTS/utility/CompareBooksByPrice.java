package com.seed.library.utility;

import com.seed.library.Book;

import java.util.Comparator;

public class CompareBooksByPrice implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        
        double pr1 =  book1.getPrice();
        double pr2 = book2.getPrice();
        if(pr1>pr2)
             return 1;
        if(pr1<pr2)
            return -1;
        return 0;
        
       //return Double.compare(book1.getPrice(), book2.getPrice());
    }
}