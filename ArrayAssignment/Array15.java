package ArrayAssignment;

public class Array15 {
	public static void main(String[] args) {
		int a[] = { 10, 30, 11, 50, 30, 70, 40, 80, 20 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println(" decending order: ");    
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]+"  ");
		}
	}
}
