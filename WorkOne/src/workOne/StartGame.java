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
			whatMoviment(p.cellsList);
			p.showBoard();
		}while(false);
		
		
		
	}

	private void whatMoviment(ArrayList<Cells> cellsList) {
		System.out.println("Digite um valor\nNEGATIVO para RETROCEDER\nPOSITIVO para AVANÇAR\nZERO para permancer");
		System.out.println("quantas celulas o bispo ira andar");
		int quantasCelulas=scan.nextInt();
		Cells position;
		for(Cells i:cellsList) {
			if(i.icon=="B") {
					Double novaPosicao;
					novaPosicao=i.robo.forward(quantasCelulas)*Math.sqrt(cellsList.size());
					int posicao=novaPosicao.intValue();
					cellsList.get(posicao).icon="B";
					cellsList.get(posicao).robo=i.robo;
					i.icon="-";
					i.robo=null;
				
			}
		
		
		}
	}
}
