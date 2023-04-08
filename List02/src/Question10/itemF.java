package Question10;

import java.util.Scanner;

public class itemF {

	public static void main(String[] args) {
		int userNumber;
		int count;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("The number must be odd!");
			System.out.println("Enter the matrix size: ");
			userNumber = scan.nextInt();
		} while (userNumber % 2 == 0);
		count = userNumber - 1;
		for (int i = 0; i < userNumber; i++) {
			for (int j = 0; j < userNumber; j++) {
				if (i == j || j == count) {
					System.out.print(j + "    ");
				} else {
					System.out.print("*    ");
				}
			}
			count--;
			System.out.println("");
		}
	}

}
