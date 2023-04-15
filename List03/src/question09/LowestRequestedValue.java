package question09;

import java.util.Scanner;

public class LowestRequestedValue {

	public static int lowestValue(int vector[], int kEsimo) {

		int aux;
		for (int i = 0; i < vector.length; i++) {
			for (int j = i; j < vector.length; j++) {

				if (vector[i] < vector[j]) {

					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}

		return vector[kEsimo - 1];
	}

	public static void main(String[] args) {

		int vectorSize;
		int userKEsimo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size: ");
		vectorSize = scan.nextInt();
		int elementsVector[] = new int[vectorSize];
		for (int i = 0; i < vectorSize; i++) {
			System.out.println("Enter the element " + (i + 1) + ":");
			elementsVector[i] = scan.nextInt();
		}
		System.out.println("Type the order of the lowest element to be searched for: ");
		userKEsimo = scan.nextInt();
		System.out.println("the number is: " + lowestValue(elementsVector, userKEsimo));

	}

}
