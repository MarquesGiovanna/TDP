package question19;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean perfectNumber(int number) {

		int divisorSum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				divisorSum += i;
		}
		if (divisorSum == number)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int userNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		userNumber = scan.nextInt();
		System.out.println(perfectNumber(userNumber));

	}

}
