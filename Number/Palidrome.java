package assignment;

public class Palidrome {

	public static void main(String args[]) {
		
		int rem,sum=0,temp;    
		  int n=455;
		  
		  temp=n;    
		  while(n != 0){    
		   rem=n%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(" ispalindrome number ");    
		  else    
		   System.out.println("isnot palindrome");    
		}  
		  
		
	}

