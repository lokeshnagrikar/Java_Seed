package Employability_lab;

import java.util.*;
public class Product   {
    int id;
    String name;
    int quantity;
    int price;
    int  gst;

    
    public Product() {
		super();
		
	}


	public Product(int id, String name, int quantity, int price, int gst) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.gst = gst;
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


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getGst() {
		return gst;
	}


	public void setGst(int gst) {
		this.gst = gst;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", gst=" + gst
				+ "]";
	}

//
//	@Override
//	public int compareTo(Product o) {
//		if(this.price>o.price)
//			return 1;
//		if(this.price<o.price)
//			return -1;		
//		return 0;
//	}


	public void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("P ID :");
        int id= sc.nextInt();

        System.out.println("P Name ;");
        String name = sc.next();

        
        System.out.println("P Quantity: ");
        int quantity=sc.nextInt();
        
        System.out.println("p Price : ");
        int price = sc.nextInt();

       
      

        System.out.println("GST :");
        int gst = sc.nextInt();

    }
	
	
	public void display() {
		 System.out.println("Product Id:"+id);
		 System.out.println("Product Name:"+name);
		 System.out.println("Quantity :"+quantity);
		 System.out.println("Price:"+price);
		 System.out.println("Product gst:"+gst);
		
	}


	
	
	

}	