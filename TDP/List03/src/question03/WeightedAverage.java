package question03;

import java.util.Scanner;

public class WeightedAverage {

	public static float averageWeight(float scoresVet[], float weightVet[]) {
		float sum = 0;
		float weightSum = 0;
		float averageResult;
		for (int i = 0; i < scoresVet.length; i++) {
			sum += scoresVet[i] * weightVet[i];
			weightSum += weightVet[i];
		}
		averageResult = sum / weightSum;
		return averageResult;

	}

	public static void main(String[] args) {
		int vectorSize;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vector size: ");
		vectorSize = scan.nextInt();
		float scores[] = new float[vectorSize];
		float weight[] = new float[vectorSize];

		System.out.println("Fill the scores vector");

		for (int i = 0; i < scores.length; i++) {
			System.out.println("Enter the score " + (i + 1) + ":");
			scores[i] = scan.nextFloat();
			System.out.println("Enter the score weight " + (i + 1) + ":");
			weight[i] = scan.nextFloat();
		}

		System.out.println("The weighted average is: " + averageWeight(scores, weight));
	}
}
