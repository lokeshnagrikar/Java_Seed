package assignment;

import java.util.Scanner;

public class NeonNum {

	public static void main(String args[]) {
		int num, sqr, last, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		num = sc.nextInt();

		sqr = num * num;

		while (sqr != 0) {
			last = sqr % 10;
			sum = sum + last;
			sqr = sqr / 10;

		}
		if (num == sum) {
			System.out.println("Number is NeonNum");
		} else {
			System.out.println("Number is Not NeonNum ");
		}
	}

}
