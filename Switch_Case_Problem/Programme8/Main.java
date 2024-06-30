package Programme8;

import java.util.Scanner;

class Book {
    private int isbnNo;
    private String bookName;
    private String author;

    public Book(int isbnNo, String bookName, String author) {
        this.isbnNo = isbnNo;
        this.bookName = bookName;
        this.author = author;
    }

    public int getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new Book(1, "B1", "James");
        books[1] = new Book(2, "B2", "Peter");
        books[2] = new Book(3, "B3", "Nicky");
        books[3] = new Book(4, "B4", "Ben");
        books[4] = new Book(5, "B5", "Ammie");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book to search:");
        String searchBook = scanner.nextLine();

       int flag = 0;
        for (Book book : books) {
            if (book!= null && book.getBookName().equals(searchBook)) {
                System.out.println("Book found:");
                System.out.println("ISBN No: " + book.getIsbnNo());
                System.out.println("Book Name: " + book.getBookName());
                System.out.println("Author: " + book.getAuthor());
               flag=1;
                break;
            }
        }

        if (flag==0) {
            System.out.println("Book not found.");
           
        }

        System.out.println("Details of all books:");
        for (Book book : books) {
            if (book!= null) {
                System.out.println("ISBN No: " + book.getIsbnNo());
                System.out.println("Book Name: " + book.getBookName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println();
            }
        }
    }
}
