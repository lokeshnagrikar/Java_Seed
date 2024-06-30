package assignment;

public class PrimeOrNot {

	

			  public static void main(String args[]) {

			  int num = 11;
			  boolean flag = false;
             for(int i=2;i<=num/2;i++)
             { 
            	 if(num % i == 0) //if number is divisible then the number is not prime
            	 {  
            	 flag=true; // is divisible then set flag true
            	 break;
            	 }
             }
			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }
			
		
	}

