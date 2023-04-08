package question05;

import java.util.Scanner;

public class VectorCopy {
	public static int[] vectorCopy(int vector[], int copyVect[]) {
		for (int i = 0; i < vector.length; i++) {
			copyVect[i] = vector[i];
		}
		return copyVect;
	}

	public static void main(String[] args) {
		int vectorSize;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size:");
		vectorSize = scan.nextInt();
		int userVector[] = new int[vectorSize];
		int copyVector[] = new int[vectorSize];
		for (int i = 0; i < userVector.length; i++) {
			System.out.println("Enter the element " + (i + 1) + ":");
			userVector[i] = scan.nextInt();
		}

		copyVector = vectorCopy(userVector, copyVector);
		System.out.println("           user     copy");
		for (int i = 0; i < copyVector.length; i++) {
			System.out.print("Element ");
			System.out.println((i + 1) + ":   " + userVector[i] + "       " + copyVector[i]);
		}
	}

}
