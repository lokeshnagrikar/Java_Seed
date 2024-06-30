package ArrayAssignment;
 //Java Program to left rotate the elements of an array
public class Array3 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };

		System.out.println("ori array : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		// logic
		
		int first;

		first = arr[0];
		for (int j = 0; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];

		}
		arr[arr.length - 1] = first;

		System.out.println("\n");

		System.out.println("array after  left rotation :");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}
}
