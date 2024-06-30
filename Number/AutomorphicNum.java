package assignment;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String args[]) {
		int n1, n2, total = 0, sq1 = 0, sq2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1 number : ");
		n2 = sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 2 number : ");
		n1 = s.nextInt();

		sq1 = n1 * n1;

		sq2 = n2 * n2;

		total = sq1 * sq2;

		System.out.println("squaring of total both number is : " + total);

	}
}
