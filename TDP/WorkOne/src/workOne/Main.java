package workOne;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int boardWidth;
		int boardHeight;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the board width: ");
		boardWidth=scan.nextInt();
		System.out.println("Enter the board height: ");
		boardHeight=scan.nextInt();
		System.out.println();
		Plane p = new Plane(boardWidth, boardHeight);
		
		p.showBoard(boardWidth, boardHeight);
		
		
		
		
		
		
	
		
//		Robot r = new Robot(1, "delta x", 2, 2, p);
//		p.verificarSeTemRobo();
//		r.moverEsquerda();
//		p.verificarSeTemRobo();

	}

}
