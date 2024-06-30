package assignment;
import java.util.Scanner;
public class DuckNum {

	
	public static void main(String args[]) {
		
		int num,sum=0,lastd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		num = sc.nextInt();
		int flag=0;
		while(num != 0 ) {
			lastd = num%10;
			if(lastd==0) {
				flag=1;
			}
			
			num=num/10;
		}
		if(flag==1) {
			 
				System.out.println(" number is BaDaK ");
				
			} else 
			{
				System.out.println(" number is not BaDaK ");
			}
		}
	}
	
