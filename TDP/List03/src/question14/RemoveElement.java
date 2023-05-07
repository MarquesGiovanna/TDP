package question14;

import java.util.Scanner;

public class RemoveElement {

	public static int[] removeElement(int vector[], int deleteElement) {

		int vectorResultSize = 0;
		int vectorResultIndice = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != deleteElement)
				vectorResultSize++;
		}

		int vectorResult[] = new int[vectorResultSize];

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != deleteElement) {
				vectorResult[vectorResultIndice] = vector[i];
				vectorResultIndice++;
			}

		}

		return vectorResult;
	}

	public static void main(String[] args) {
		int userVectorSize;
		int userDeleteElement;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size:");
		userVectorSize = scan.nextInt();
		int userVector[] = new int[userVectorSize];
		System.out.println("Enter the element to be deleted:");
		userDeleteElement = scan.nextInt();
		for (int i = 0; i < userVector.length; i++) {

			System.out.println("Enter the element " + (i + 1) + ":");
			userVector[i] = scan.nextInt();

		}
		int vectorResult[] = new int[removeElement(userVector, userDeleteElement).length];
		vectorResult = removeElement(userVector, userDeleteElement);

		for (int i = 0; i < vectorResult.length; i++) {

			System.out.println("Element " + (i + 1) + ": " + vectorResult[i]);

		}

	}

}
