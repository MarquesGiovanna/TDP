package workOne;

import java.util.ArrayList;
import java.util.Random;

public class Plane {
	
	public ArrayList<Cells> cellsList;
	public int width;
	public int height;
	Random random = new Random();
	

	public Plane(int sizeX, int sizeY) {	
		width=sizeX;
		height=sizeY;
		cellsList = new ArrayList<Cells>();
			int count = 1;
			
			
			for (int i = 1; i <= sizeX; i++) {
				for (int j = 1; j <= sizeY; j++) {
					Cells cell = new Cells(count, i, j);
					cellsList.add(cell);
					count++;
				}
			}
			generateRobot(sizeX*sizeY,sizeX);
			
	}
	

	
	
	public void generateRobot(int quantityOfCells, int widthSize) {
		int aux;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo= new walkerRobot(1, "walkerRobot",aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo= new Pawn(2, "pawn", aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo=new Rook(3, "rook", aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo=new Bishop(4, "bishop", aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo=new Knight(5, "knight", aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo=new King(6, "king", aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		
		aux=random.nextInt(quantityOfCells);
		cellsList.get(aux).robo=new Queen(7, "queen", aux, widthSize);
		cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
	
		
		
	}
	
	
	
	
	public void showBoard(int sizeX, int sizeY) {
		int count=0;
		for(int i = 0; i<sizeX; i++) {
			for(int j=0;j<sizeY;j++) {
				cellsList.get(count).printCell();
				count++;
			}
			System.out.println();
		}
		
	}
	
	
	

	public void verificarSeTemRobo() {
		for (int i = 0; i < cellsList.size(); i++) {
			Cells aux = cellsList.get(i);
			if (cellsList.get(i).robo != null) {
				System.out.println("tem robo" + aux.robo.name + "  - x: " + aux.positionX + "  - y: " + aux.positionY);
			}
		}
	}


	public Cells retornarCelula(int x, int y) {

		for (int i = 0; i < cellsList.size(); i++) {
			if (cellsList.get(i).positionX == x && cellsList.get(i).positionY == y) {
				return cellsList.get(i);
			}
		}
		return null;
	}

//	public void retornarCelulas() {
//		for (int i = 0; i < cellsList.size(); i++) {
//			System.out.println(cellsList.get(i).imprimir());
//		}
//	}

}
