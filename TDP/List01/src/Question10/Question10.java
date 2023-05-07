package Question10;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		int numberA;
		int numberB;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		numberA = scan.nextInt();
		System.out.println("Enter the number B: ");
		numberB = scan.nextInt();
		int sum = numberA + numberB;

		if (numberA > 10) {
		} else {
			System.out.println("number smaller than 10");
		}
		if (sum == 20) {
		} else
			System.out.println("number different of 20");

	}

}
