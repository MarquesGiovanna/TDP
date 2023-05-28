package workOne;

import java.util.ArrayList;
import java.util.Scanner;

public class StartGame {

	public int boardWidth;
	public int boardHeight;
	public Scanner scan = new Scanner(System.in);
	int quantasCelulas;

	public StartGame() {

		System.out.println("Enter the board width: ");
		boardWidth = scan.nextInt();
		System.out.println("Enter the board height: ");
		boardHeight = scan.nextInt();
		System.out.println();
		Plane p = new Plane(boardWidth, boardHeight);
		p.showBoard();
		
		 do{
			p.cellsList = whatMoviment(p.cellsList, boardWidth);
			p.showBoard();
		}while(false);
		
		
		
	}

	private ArrayList<Cells> whatMoviment(ArrayList<Cells> cellsList, int boardWidth2) {
		System.out.println("Digite um valor\nNEGATIVO para RETROCEDER\nPOSITIVO para AVANÇAR\nZERO para permancer");
		System.out.println("quantas celulas o bispo ira andar");
		int movimento=scan.nextInt();
		int quantasCelulas=boardWidth*movimento;
		Cells position;
		for(Cells i:cellsList) {
			if(i.icon=="B") {
					int id;
					id=(i.id-quantasCelulas);
					id-=1;
					cellsList.get(id).icon="B";
					cellsList.get(id).robo=i.robo;
					i.icon="-";
					i.robo=null;
				
			}
		
		
		}
		return cellsList;
	}
	
}
