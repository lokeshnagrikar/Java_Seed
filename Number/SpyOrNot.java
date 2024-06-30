package assignment;
import java.util.Scanner;
public class SpyOrNot {

	
	public static void main(String args[])
	{
		int num,sum=0,product=1,lastd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		while(num>0)
		{
			lastd= num%10;
            sum =sum + lastd;
            product=product*lastd;
            num= num/10;
		}
		if(sum==product) {
		System.out.println("number is spy ");
		}
		else
		{
			System.out.println("number is not spy ");
		}
	}//end main
	
}//end class 
