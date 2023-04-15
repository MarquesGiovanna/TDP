package question13;

import java.util.Scanner;

public class SearchForEvents {

	public static int[] searchEvents(int vectorOne[], int vectorTwo[]) {

		int vectorResultSize = 0;
		int vectorResultIndice = 0;

		for (int i = 0; i < vectorOne.length; i++) {
			for (int j = 0; j < vectorOne.length; j++) {

				if (vectorOne[i] == vectorTwo[j]) {
					vectorResultSize++;

				}
			}
		}

		int vectorResult[] = new int[vectorResultSize];

		for (int i = 0; i < vectorOne.length; i++) {
			for (int j = 0; j < vectorOne.length; j++) {

				if (vectorOne[i] == vectorTwo[j]) {
					vectorResult[vectorResultIndice] = vectorOne[i];
					vectorResultIndice++;

				}
			}
		}

		return vectorResult;
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
		int vectorResult[] = new int[searchEvents(userVectorOne, userVectorTwo).length];
		vectorResult = searchEvents(userVectorOne, userVectorTwo);

		for (int i = 0; i < vectorResult.length; i++) {

			System.out.println(vectorResult[i]);

		}

	}

}
