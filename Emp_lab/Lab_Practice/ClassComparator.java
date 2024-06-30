package Employability_lab;

import java.util.Comparator;

public class ClassComparator implements Comparator<Product> 
{


	
	@Override
	public int compare(Product p1, Product p2) {
		
	 int pr1=p1.getPrice();
	  int pr2=p2.getPrice();
	   if(pr1>pr2)
	    return 1;
	  if(pr1<pr2)
		return -1;
	  return 0;
	
		
	}
	 
}