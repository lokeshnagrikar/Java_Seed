package assignment;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum=0, lastd;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num = sc.nextInt(); 
		
		while(num > 0)  
		{  
		//finds the last digit of the given number    
		lastd = num % 10;  
		//adds last digit to the variable sum  
		sum = sum + lastd;  
		//removes the last digit from the number  
		num = num / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum); 

	}

}
