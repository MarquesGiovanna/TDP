package Question04;
import java.util.Scanner;

public class Question04 {
	
	public static void main(String[] args) {
		int numberA;
		int numberB;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		numberA = scan.nextInt();
		System.out.println("Enter the number B: ");
		numberB = scan.nextInt();
		int sum = numberA + numberB;

		if (numberA > 10 || sum == 20) {
			System.out.println("valid number");
		}
		if (!(numberA > 10 && sum == 20)) {
			if (numberA == numberB)
				System.out.println("A equal B; A and B are differents of 10;A smaller than 10;");
			else
				System.out.println("invalid number");

		}


	}

}
