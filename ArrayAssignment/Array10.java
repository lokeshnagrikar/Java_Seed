package ArrayAssignment;

//  Java Program to print the smallest element in an array
public class Array10 {

	public static void main(String[] args) {
		int arr[] = { 30, 70, 10, 20, 40, 50, 80 };

		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i])
				smallest = arr[i];

		}

		System.out.println("smallest element of given array is : " + smallest);

	}
}
