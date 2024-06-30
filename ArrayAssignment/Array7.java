package ArrayAssignment;

// Java Program to print the elements of an array present on even position
public class Array7 {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };

		System.out.println("ori array : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("\n ");
		System.out.println("array elements even places :");

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				System.out.print(a[i] + "  ");
		}

	}

}
