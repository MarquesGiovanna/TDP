package question02;

import java.util.Scanner;

public class Average {
	public static float average(float vetOne[], float vetTwo[]) {
		float sum = 0;
		float averageResult;
		for (int i = 0; i < vetOne.length; i++) {
			sum += vetOne[i];
		}
		for (int i = 0; i < vetTwo.length; i++) {
			sum += vetTwo[i];
		}
		averageResult = sum / ((vetOne.length) + (vetTwo.length));
		return averageResult;
	}

	public static void main(String[] args) {
		int vectorSize;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size one: ");
		vectorSize = scan.nextInt();
		float vectorOne[] = new float[vectorSize];
		System.out.println("Enter the array size two: ");
		vectorSize = scan.nextInt();
		float vectorTwo[] = new float[vectorSize];

		System.out.println("Fill the vector one");

		for (int i = 0; i < vectorOne.length; i++) {
			System.out.println("Enter the number: ");
			vectorOne[i] = scan.nextFloat();
		}

		System.out.println("Fill the vector two");

		for (int i = 0; i < vectorTwo.length; i++) {
			System.out.println("Enter the number: ");
			vectorTwo[i] = scan.nextFloat();
		}
		System.out.println("The average result is: " + average(vectorOne, vectorTwo));

		// System.out.println("one: "+arrayOne.length+" two: "+arrayTwo.length);

	}

}
