package question12;

import java.util.Scanner;

public class PrimerNumber {

	public static boolean IsPrimeNumber(int number) {
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
		System.out.println(IsPrimeNumber(userNumber));

	}

}
