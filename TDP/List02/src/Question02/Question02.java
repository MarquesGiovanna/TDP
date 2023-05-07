package Question02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		do {
			sum += i;
			System.out.println("Enter the number:");
			i = scan.nextInt();
		} while (i >= 0);
		System.out.println("The sum is " + sum);
	}

}
