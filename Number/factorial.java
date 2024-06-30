package assignment;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int fact=1;
		int number=4;
		
		for(i=1;i<=number;i++) {
			
			fact = fact * i;
		}
		System.out.println("Factorial of " +number+ " is : \n" +fact);

	}

}
