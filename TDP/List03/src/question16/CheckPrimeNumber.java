package question16;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static boolean checkPrimeNumber(int number) {

		int i = 1;
		int counter = 0;
		while (i <= number) {
			if (number % i == 0)
				counter++;
			i++;
		}
		if (counter == 2)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		int userNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		userNumber = scan.nextInt();
		System.out.println(checkPrimeNumber(userNumber));

	}

}
