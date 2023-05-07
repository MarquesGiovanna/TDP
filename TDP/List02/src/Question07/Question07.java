package Question07;

import java.util.Scanner;

public class Question07 {

	public static int findingPrimeNumber(int number) {
		int i = 1;
		int counter = 0;
		while (i <= number) {
			if (number % i == 0)
				counter++;
			i++;
		}
		if (counter == 2)
			return number;
		else
			return 0;
	}

	public static void main(String[] args) {
		int userNumber = 0;
		int toStore = 0;
		int greaterPrimeNumber = 0;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		userNumber = scan.nextInt();
		while (i <= userNumber) {
			toStore = findingPrimeNumber(i);
			if (toStore > greaterPrimeNumber)
				greaterPrimeNumber = toStore;
			i++;
		}
		System.out.println("The greater prime number smaller than entered is: " + greaterPrimeNumber);

	}

}
