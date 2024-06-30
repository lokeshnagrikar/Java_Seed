package assignment;

import java.util.Scanner;

public class fisrtAndlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, fd = 0, ld = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();

		ld = num % 10;

		while (num >= 10) {
			fd = num /= 10;
		}

		sum = fd + ld;

		System.out.println("addition of first digit " + fd + " and last digit " + ld + " is : " + sum);

	}

}
