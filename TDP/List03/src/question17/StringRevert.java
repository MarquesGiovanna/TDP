package question17;

import java.util.Scanner;

public class StringRevert {

	public static String stringRevert(String word) {

		String wordReverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			wordReverse += word.charAt(i);
		}

		return wordReverse;
	}

	public static void main(String[] args) {
		String userWord;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		userWord = scan.next();
		System.out.println(stringRevert(userWord));

	}

}
