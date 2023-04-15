package question18;

import java.util.Scanner;

public class CompoundInterest {

	public static float compoundInterest(float value, float rate, int time) {

		float rateResult = 1;
		rate += 1;
		for (int i = 1; i <= time; i++)
			rateResult = rateResult * rate;

		value = value * rateResult;
		return value;
	}

	public static void main(String[] args) {
		float userValue;
		float userRate;
		int userTime;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		userValue = scan.nextFloat();
		System.out.println("Enter the rate");
		userRate = scan.nextFloat();
		System.out.println("Enter the time:");
		userTime = scan.nextInt();
		System.out.println(compoundInterest(userValue, userRate, userTime));
	}

}
