package Question05;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		int userNumberLeft = 0;
		int userNumberRight = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to the left:");
		userNumberLeft = scan.nextInt();
		System.out.println("Enter a number to the right:");
		userNumberRight = scan.nextInt();

		for (int i = 0; i <= userNumberLeft; i++) {
			for (int j = 0; j <= userNumberRight; j++) {
				System.out.println(i + " - " + j);
			}
		}

	}

}
