package ArrayAssignment;

// Java Program to print the elements of an array in reverse order
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
		
		   System.out.print("Original array: ");  
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		   System.out.println("\n");
		   
		   
		   System.out.print("Reverse array: "); 
		   for(int i=a.length-1;i>=0;i--)
			{
				System.out.print(a[i]+"  ");
			}
		   
		

	}

}
