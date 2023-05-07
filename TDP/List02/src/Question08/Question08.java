package Question08;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		boolean valid = true;
		String mathExpression;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		mathExpression = scan.next();

		for (int i = 0; i < mathExpression.length(); i++) {
			if (mathExpression.charAt(i) == '(') {

				for (int j = i + 1; j < mathExpression.length(); j++) {
					if (mathExpression.charAt(j) == ')') {
						valid = true;
						break;
					} else
						valid = false;
				}
			}
			if (mathExpression.charAt(i) == '[') {

				for (int j = i + 1; j < mathExpression.length(); j++) {
					if (mathExpression.charAt(j) == ']') {
						valid = true;
						break;
					} else
						valid = false;
				}
			}
			if (mathExpression.charAt(i) == '{') {

				for (int j = i + 1; j < mathExpression.length(); j++) {
					if (mathExpression.charAt(j) == '}') {
						valid = true;
						break;
					} else
						valid = false;
				}
			}
		}
		if (valid == true)
			System.out.println("The expression is right");
		else
			System.out.println("The expression is wrong");
	}
}
