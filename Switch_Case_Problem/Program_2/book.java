package Program_2;


import java.util.Scanner;

public class book {
	
	int book_id;
	String book_name;

	String author;
	int price;
	static int count;
	public static int idCounter;

	public book() {
		book_id = ++count;
		book_name = null;

		author = null;
		price = 0;
	}

	public book(String book_name, int book_id, String author, int price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;

		this.author = author;
		this.price = price;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" book Id : ");
		book_id = sc.nextInt();
		
		System.out.println(" book name : ");
		book_name = sc.next();
		
		System.out.println(" book Author : ");
		author = sc.next();
		System.out.println(" book price : ");
		price = sc.nextInt();
	}

	public void displayBookDetails() {
		System.out.println(" book name : " + book_name);
		System.out.println(" book Id : " + book_id);
		System.out.println(" book Author : " + author);
		System.out.println(" book price : " + price);

	}

//	public void updateBookInfo( int book_id,String book_name, String author, int price) {
//		
//		if(this.book_id = book_id){
//			
//		
//		this.book_name = book_name;
//
//		this.author = author;
//		this.price =  price;
//		
//	}
//	}
	
	public void updateBookInfo(int book_id, String book_name, String author, int price) {
        
		
		this.book_id = book_id ;
        	
        this.book_name = book_name;
            this.author = author;
            this.price = price;
                   
            
            
            
            
 
}// end class

	
public static class Bookdemo {
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	  int ch=0;
	 book bk[] = new book[100];
	   do {
		   System.out.println("1)Accept Book Information");
		   System.out.println("2) Update Book Information by ID");
		   System.out.println("3)Display all Book Details");
		   System.out.println("4)Dispaly details by author");
		   System.out.println("5)Display book details of Book_Id");
		   System.out.println("6)Enter your choice");
		   ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1 :
			   bk[book.count]=new book();
			   bk[book.count-1].accept();
			   break;
			   
		   case 2 :
//			   System.out.print("Enter book Id: ");
//               int  book_id = sc.nextInt();
//               System.out.print("Enter new book name: ");
//               String bookname = sc.nextLine();
//               System.out.print("Enter new author: ");
//               String author = sc.nextLine();
//               System.out.print("Enter new price: ");
//               int price = sc.nextInt();
//               sc.nextLine(); // Consume newline
//               for (book book : bk) {
//                   book.updateBookInfo(book_id ,bookname, author,  price );
//               }
//               break;
			   System.out.print("Enter book Id: ");
               int updateBookId = sc.nextInt();
               System.out.print("Enter new book name: ");
               String newBookName = sc.nextLine();
               System.out.print("Enter new author: ");
               String newAuthor = sc.nextLine();
               System.out.print("Enter new price: ");
               int newPrice = sc.nextInt();
              
               for (book book : bk) {
                   book.updateBookInfo(updateBookId, newBookName, newAuthor, newPrice);
               }
               break;
		   
		   
		   
		   }
	   }while(ch!=5);
 }


