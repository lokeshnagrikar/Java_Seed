package assignment;
import java.util.Scanner;
public class KrishnaMarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n,num,rem,sum= 0,fact;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		num=n;
		while(num != 0) {
			fact=1;
			rem=num%10;
			for(int i=1;i<=rem;i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			num=num/10;
			
		}
		 if(sum==n) {
			 System.out.println(n+" is special number");
		 } 
		 else 
		 {
			 System.out.println(n+" Is not special number");
		 }
		
		
		
		
	}

}
