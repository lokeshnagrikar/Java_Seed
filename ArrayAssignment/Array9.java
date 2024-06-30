package ArrayAssignment;
// Java Program to print the largest element in an array
public class Array9 {

	public static void main(String[] args) {
		int arr[] = { 30, 70, 10, 20, 40, 50, 80 };
		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i])
				largest = arr[i];

		}

		System.out.println("Largest element of given array is :" + largest);

	}// end main

} // end class

//		for (int i = 0; i < arr.length; i++) {
//			for (int k = 0; k<arr.length; k++) {
//				if (arr[i] > arr[k]) //
//					Largest = arr[i];
//				
//			}
//
//		}