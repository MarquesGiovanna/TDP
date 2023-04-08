package Question03;

import java.util.Scanner;
import java.util.Random;

public class Question03 {

	public static void main(String[] args) {
		Random number = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNumber = number.nextInt(1, 100);
		int userNumber = 0;

		do {
			System.out.println("Enter the number:");
			userNumber = scan.nextInt();

			if (userNumber > randomNumber) {
				System.out.println("The number to be guessed is SMALLER than the number entered.");
			}
			if (userNumber < randomNumber) {
				System.out.println("The number to be guessed is GREATER than the number entered.");
			}
		} while (userNumber != randomNumber);

		System.out.println("Congratulations! You got it right");

	}

}
