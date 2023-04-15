package question20;

import java.util.Scanner;

public class VectorDown {

	public static void vectorDown(int lengthVector) {

		for (int i = lengthVector; i > 0; i--) {
			int vector[] = new int[i];
			System.out.println("tamanho: " + vector.length);
		}

	}

	public static void main(String[] args) {
		int userNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		userNumber = scan.nextInt();
		vectorDown(userNumber);

	}

}
