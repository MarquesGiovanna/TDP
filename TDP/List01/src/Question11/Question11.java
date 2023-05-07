package Question11;
import java.util.Scanner;

public class Question11 {

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
			if (sum == 20)
				System.out.println("A+B==20");
			else
				System.out.println("invalid number");
		}

	}

}
