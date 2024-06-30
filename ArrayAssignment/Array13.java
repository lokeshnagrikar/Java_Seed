package ArrayAssignment;
// Java Program to right rotate the elements of an array
public class Array13 {

	public static void main(String[] args) {
		
	int arr[]= {10,20,30,40,50};
	 int last = arr[arr.length-1]; // 5-1 = 4..length
	
	 
	 for(int i=arr.length-1;i>0;i--) {
		 
		 arr[i]= arr[i-1];
	 }
	 arr[0]=last;
	 
	 System.out.println(" array right rotate :");
	 for(int i=0;i<=arr.length-1;i++) {
		 System.out.println(arr[i]+"  ");
	 }
	}
	
}
