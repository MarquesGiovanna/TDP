package question10;

import java.util.Scanner;

public class EqualityCheck {

	public static boolean checkForEquality(int vectorOne[], int vectorTwo[]) {

		boolean validation = true;

		for (int i = 0; i < vectorOne.length; i++) {

			if (vectorOne[i] != vectorTwo[i])
				validation = false;

		}

		return validation;
	}

	public static void main(String[] args) {
		int vectorSize;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size: ");
		vectorSize = scan.nextInt();
		int userVectorOne[] = new int[vectorSize];
		int userVectorTwo[] = new int[vectorSize];

		System.out.println("Fill the scores vector");

		for (int i = 0; i < userVectorOne.length; i++) {
			System.out.println("Enter the vector one element " + (i + 1) + ":");
			userVectorOne[i] = scan.nextInt();

		}
		for (int i = 0; i < userVectorOne.length; i++) {

			System.out.println("Enter the vector two element " + (i + 1) + ":");
			userVectorTwo[i] = scan.nextInt();
		}

		System.out.println(checkForEquality(userVectorOne, userVectorTwo));
	}

}
