package question01;

import java.util.Scanner;

public class summation {
	public static float sum(float vet[]) {
		float result = 0;
		for (int i = 2; i < vet.length - 2; i++) {
			result += vet[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int arraySize;
		float result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		arraySize = scan.nextInt();
		float array[] = new float[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.println("enter the number: ");
			array[i] = scan.nextFloat();
		}
		result = sum(array);
		System.out.println("the sum is: " + result);
	}

}
