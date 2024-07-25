package seed.library.main;

import com.seed.library.Book;
import com.seed.library.utility.CompareBooksByName;
import com.seed.library.utility.CompareBooksByPrice;
import com.seed.library.utility.PrintUtil;
import com.seed.library.utility.StoreUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class libraryMain {
    public static void main(String[] args) {
    	
    	

    	
        StoreUtil<Book> storeUtil = new StoreUtil<Book>();

        Book book;
        
        Scanner sc = new Scanner(System.in);
      
        int ch;
        try {
	do {
	
            System.out.println("________Enter your Choice________");
         
            System.out.println("2. Print all books");
            System.out.println("3. Sort books by name");
            System.out.println("4. Sort books by price");
            System.out.println("5. Get No. Of Records");
            System.out.println("6. Quit"); 

            ch = sc.nextInt();

            switch (ch)
            {
                case 1 :

                    System.out.println("Enter Book Details :");
                    System.out.println("Enter Id :");
                    int id = sc.nextInt();
                    
                    System.out.println("Enter Name :");
                    String name = sc.next();
                    
                    System.out.println("Enter Authors name : ");
                    Set<String> author = new HashSet<>();
                    
                   
                   
                    int  c;
                    while(true) {
                       String Authors = sc.next();
                       author.add(Authors);
                       System.out.println("do you Want to Continue..y/n");
                       c =sc.next().charAt(0);
                       if(c == 'n' || c == 'N')
                    	   break;
                    }
                    
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    
                    book = new Book(id, name, author, price);
                    storeUtil.addRecord(book);
                  
                    break;



                case 2 :
                	List<Book> book1 = storeUtil.getRecords();
                   System.out.println("List of Books:");
                    PrintUtil.printRecords(book1);
                    break; 
//               

              
                case 3:
                   book1 = storeUtil.getRecords();
                	Collections.sort(book1, new CompareBooksByName());
                	System.out.println("sorted  by name :- ");
                	for(Book b: book1)
                	{
                		System.out.println(b);
                	}
                
                	 
                     break;
                     
                case 4 :
                	
                	book1 = storeUtil.getRecords();
                 	Collections.sort(book1, new CompareBooksByPrice());
                 	System.out.println("sorted by Price :- ");
                 	for(Book b: book1)
                 	{
                 		System.out.println(b);
                 	}
                 
                 	 
                      break;
                      
                case 5 : 
                	   int numBooks = storeUtil.getNoOfRecords();
                       System.out.println("Number of books: " +numBooks);
                       break;
                    	
                case 6 :
                	 System.out.println("Goodbye! Existing Store......");
                     return;
                       
                default:
                    System.out.println("Invalid choice. Try again!");


            }  //switch

        }while(ch!=6); //end while
	
        }
        catch(InputMismatchException e)
        {
//        	
        	 System.out.println("Invalid input! Please enter a valid Input.");
        }
    } //end main
    
} //end class
