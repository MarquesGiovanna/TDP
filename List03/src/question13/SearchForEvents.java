package question13;

import java.util.Scanner;


public class SearchForEvents {

	public static int[] searchEvents(int vectorOne[], int vectorTwo[]) {

		int counter=0;
		int vectorResultIndice=0;
		for (int i = 0; i < vectorOne.length; i++) {
			for (int j = i; j < vectorOne.length; j++) {

				if (vectorOne[i] == vectorTwo[j]) {
					counter++;

				}
			}
		}
		int vectorResult[] = new int[counter];
		for (int i = 0; i < vectorOne.length; i++) {
			for (int j = i; j < vectorOne.length; j++) {

				if (vectorOne[i] == vectorTwo[j]) {
					vectorResult[vectorResultIndice]=vectorOne[i];
					vectorResultIndice++;

				}
			}
		}
		for (int i = 0; i < vectorOne.length; i++) {
			System.out.println("element "+(i+1)+": "+vectorResult[i]);
		}

		return vectorResult;
	}

	public static void main(String[] args) {
		int vectorSize;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size: ");
		vectorSize = scan.nextInt();
		int userVectorOne[] = new int[vectorSize];
		int userVectorTwo[] = new int[vectorSize];

		System.out.println("Fill the scores vector");

		for (int i = 0; i < userVectorOne.length; i++) {
			System.out.println("Enter the vector one element " + (i + 1) + ":");
			userVectorOne[i] = scan.nextInt();
			
		}
		for (int i = 0; i < userVectorOne.length; i++) {
			
			System.out.println("Enter the vector two element " + (i + 1) + ":");
			userVectorTwo[i] = scan.nextInt();
		}
		searchEvents(userVectorOne,userVectorTwo);
		

	}

}
