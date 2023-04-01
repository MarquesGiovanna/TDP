package Question04;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNumber;
		int multipliedNumber=0;
		System.out.println("Enter the number:");
		userNumber=scan.nextInt();
		
		while(multipliedNumber<=10) {
			System.out.println(userNumber+" * "+multipliedNumber+" = "+userNumber*multipliedNumber);
			multipliedNumber++;
		}

	}

}
