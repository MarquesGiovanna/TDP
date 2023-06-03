package workOne;

//import java.util.ArrayList;
import java.util.Scanner;

public class StartGame {

	public int boardWidth;
	public int boardHeight;
	public Scanner scan = new Scanner(System.in);
	Plane p;

	public StartGame() {

		System.out.println("Enter the board width: ");
		boardWidth = scan.nextInt();
		System.out.println("Enter the board height: ");
		boardHeight = scan.nextInt();
		System.out.println();
		p = new Plane(boardWidth, boardHeight);
		p.showBoard();

	}

	public void Start() {

		p.userMove();
		p.showBoard();
		System.out.println("Do you want to continue the game?\n0 - continue\n1 - leave");
		int continuation = scan.nextInt();
		if (continuation == 0)
			Start();
		System.out.println("Scores:");
		p.printScores();
		System.out.println("Positions:");
		p.printPositions();
	}

}
