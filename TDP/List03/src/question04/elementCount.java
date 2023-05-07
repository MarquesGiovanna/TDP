package question04;

import java.util.Scanner;

public class elementCount {

	public static int findElement(int element, int vetOne[], int vetTwo[]) {
		int counter = 0;

		for (int i = 0; i < vetOne.length; i++) {
			if (vetOne[i] == element)
				counter++;
			if (vetTwo[i] == element)
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		int vectorSize;
		int userElement;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vectors size:");
		vectorSize = scan.nextInt();
		int vectorOne[] = new int[vectorSize];
		int vectorTwo[] = new int[vectorSize];
		for (int i = 0; i < vectorOne.length; i++) {
			System.out.println("element " + (i + 1) + " of the vectorOne: ");
			vectorOne[i] = scan.nextInt();
			System.out.println("element " + (i + 1) + " of the vectorTwo: ");
			vectorTwo[i] = scan.nextInt();
		}
		System.out.println("Set the number to be found:");
		userElement = scan.nextInt();

		System.out.println("The element was find " + findElement(userElement, vectorOne, vectorTwo) + " a times");
	}

}
