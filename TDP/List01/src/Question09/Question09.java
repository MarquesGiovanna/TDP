package Question09;
import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		int numberA;
		int numberB;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		numberA = scan.nextInt();
		System.out.println("Enter the number B: ");
		numberB = scan.nextInt();
		int sum = numberA + numberB;

		if (numberA > 10) {}
		if (sum == 20)
			System.out.println("A + B == 20");
		if (!(numberA > 10 && sum == 20))
			System.out.println("invalid number");

	}

}
