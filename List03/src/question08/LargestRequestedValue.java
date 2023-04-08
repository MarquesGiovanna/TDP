package question08;

import java.util.Scanner;

public class LargestRequestedValue {

	public static int largestValue(int vector[], int kEsimo) {

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
		System.out.println("Type the order of the largest element to be searched for: ");
		userKEsimo = scan.nextInt();
		System.out.println("the number is: " + largestValue(elementsVector, userKEsimo));

	}

}
