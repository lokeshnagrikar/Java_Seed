package ArrayAssignment;
//java Program to print the sum of all the items of the array
public class Array12 {

	public static void main(String[] args) {
		int a[] = { 30, 70, 10, 20, 40, 50, 80 };
		int sum =0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println(" Sum of all elements of array : "+sum);
		
		
	}
}
