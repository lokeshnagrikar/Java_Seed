package com.seed.library;

import java.util.List;
import java.util.Set;

public class Book {

   private int id;
    private String name;

     Set<String> authors;

     private double price;

    public Book() {
        super();
    }

//    public Book(int id,String name , Set<String> authors,int price) {
//        this.id = id;
//        this.name = name;
//        this.authors = authors;
//        this.price = price;
//
//
//
//    }

    public Book(int id, String name, Set<String> authorSet, double price) {
        this.id=id;
        this.name=name;
        this.authors=authorSet;
         this.price= price;
    }

   

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                '}';
    }


	

}
