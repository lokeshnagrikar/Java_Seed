package Employability_lab;
import java.util.*;
public class Main {

	
	 public static void main(String[] args) {
		 
	  Scanner sc = new Scanner(System.in);
	  
	  ArrayList<Product> pr =new ArrayList<>();
	  
	 int ch=0;
	 
	 do {
		  System.out.println("\nMenu:");
          System.out.println("1. Add product");
          System.out.println("2. Display products (sorted by price)");
          System.out.println("3. Update product info");
          System.out.println("4. Delete product");
          System.out.println("5. Create bill (calculated price)");
          System.out.println("6. Exit");
          System.out.print("Enter your choice: ");
          
          ch =sc.nextInt();
           
          switch (ch) {
		case 1:
			

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
		        Product product = new Product(id, name, quantity, price, gst);
		        pr.add(product);
		        
		         System.out.println("Product added successfully!");
			break;

		case 2 : 
			
			// Display products (sorted by price)
			
			 System.out.println("\nProducts:");
            Collections.sort(pr,new ClassComparator());
            
            Iterator<Product> pit = pr.iterator();    
            while(pit.hasNext())
            {
            	Product p = pit.next();
            	p.display();
            }
			break;
			
		case 3 : 
			
			// Update product info
			
			System.out.println("Enter ID to Update : ");
			id = sc.nextInt();
			
			for(Product pd: pr) {
				if(pd.id == id)
				{
					System.out.println("Enter product Name: ");
					pd.name = sc.next();
					 System.out.print("Enter new product price: ");
					 pd.price= sc.nextInt();
					 
					 System.out.print("Enter new product quantity: ");
					 pd.quantity= sc.nextInt();
					 
					 System.out.println("Product updated successfully!");
					 break;
				}
			}
			 System.out.println("Product not found!");
 
			
		     break;
		     
		     
		case 4 :
			//DELETE PRODUCT 
			
			System.out.print("Enter the ID of the product to delete: ");
            int deleteId = sc.nextInt();
          
            boolean productDeleted = false;
            for (int i = 0; i <pr.size(); i++) {
                if (pr.get(i).id == deleteId) {
                    pr.remove(i);
                    productDeleted = true;
                    break;
                }
            }
	
            if (productDeleted) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Product with ID " + deleteId + " not found.");
            }
            break;
            
		case 5 :
			
			
			break;
			
		default:
			 System.out.println("Invalid choice. Please enter a number between 1 and 6.");
          
			break;
		}
		 
	 }while(true);
	   
	}
}
