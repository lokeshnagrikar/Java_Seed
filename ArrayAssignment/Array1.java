package ArrayAssignment;

//Java Program to copy all elements of one array into another array

public class Array1 {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = new int[arr1.length];

		// copying array1 element into another array
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

		}
		System.out.println("elemnts of arr1 :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i] + "\n");

		}
		System.out.println("elemnts of arr2 :");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(" " + arr2[i]);

		}

	}
}
