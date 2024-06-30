package Employability_lab;

import java.util.Comparator;

public class booksName implements Comparator<book> {

	

	@Override
	public int compare(book b1, book b2) {
		
		
		return b1.getBname().compareTo(b2.getBname());
		
	}

}
