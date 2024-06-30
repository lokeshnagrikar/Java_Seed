package Employability_lab;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of books :");
		int no = scan.nextInt();
      
		 
		 
		book b[] = new book[no];
		
		
		
		for(int i=0;i<no;i++) {
		
		System.out.println("Enter Book name :");
		String bName = scan.next();
		
		
		System.out.println("Enter Book Price : ");
	    int bprice = scan.nextInt();

	   
	  
	    System.out.println("Enter Author name");
	   String Aname = scan.next();
       
       
       
        b[i] = new book(bName,bprice,Aname);
        
        
        }  
		
//		 booksName comparator = new booksName();
//	        Arrays.sort(b, comparator);
		 
		Arrays.sort(b,new booksName()); // also we should write
        
        
	    System.out.println("Sorted books:");

		for(book bk :b) {
			
		 System.out.println("Book Name : "+bk.getBname());
		       System.out.println("Book Price : "+bk.getBprice());
		       System.out.println("Author Name : "+bk.getAuthorname());
		}
		       
		
		System.out.println("Enter a book name to search:");
        String searchBookName = scan.next();

        boolean found = false;
        for (book bk : b) {
            if (bk.getBname().equals(searchBookName)) {
                System.out.println("Book found : ");
                System.out.println("Book Name : " + bk.getBname()+ "\n" +
                "Book Price : " + bk.getBprice()+ "\n"+
                "Author Name : " + bk.getAuthorname());
//                System.out.println("Book Name : " + bk.getBname());
//                System.out.println("Book Price : " + bk.getBprice());
//                System.out.println("Author Name : " + bk.getAuthorname());
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Book not found");
        }
		
		
		
	}

}
