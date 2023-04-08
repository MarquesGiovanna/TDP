package question06;

import java.util.Scanner;

public class ascendingOrder {

	public static int[] ascending(int vector[]) {

		int aux;
		for (int i = 0; i < vector.length; i++) {
			for (int j = i; j < vector.length; j++) {

				if (vector[i] > vector[j]) {

					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}

		return vector;
	}

	public static void main(String[] args) {
		int vectorSize;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size: ");
		vectorSize = scan.nextInt();
		int elementsVector[] = new int[vectorSize];
		for (int i = 0; i < vectorSize; i++) {
			System.out.println("Enter the element " + (i + 1) + ":");
			elementsVector[i] = scan.nextInt();
		}

		elementsVector = ascending(elementsVector);
		for (int i = 0; i < vectorSize; i++) {
			System.out.println("Element " + (i + 1) + ": " + elementsVector[i]);

		}

	}

}
