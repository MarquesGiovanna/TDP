package question15;

import java.util.Scanner;

public class CheckPalindrome {

	public static boolean checkPalindrome(String word) {

		String wordReverse = "";
		boolean valid = false;
		for (int i = word.length() - 1; i >= 0; i--) {
			wordReverse += word.charAt(i);
		}

		if (word.equals(wordReverse))
			valid = true;

		return valid;
	}

	public static void main(String[] args) {

		String userWord = " ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		userWord = scan.next();
		System.out.println(checkPalindrome(userWord));

	}

}
