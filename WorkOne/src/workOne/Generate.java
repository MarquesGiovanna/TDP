package workOne;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Generate {

	public int aux;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);

	public void generatePlane(int width, int height, ArrayList<Cells> cellsList) {
		int count = 1;
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				Cells cell = new Cells(count, i, j);
				cellsList.add(cell);
				count++;
			}
		}
	}

	public void generateRobot(int i, int width, ArrayList<Cells> cellsList) {
		ArrayList <Robot> robots = new ArrayList<>();
		aux = random.nextInt(0,cellsList.size()-1);
		robots.add(null);
		walkerRobot walker = new walkerRobot(1, "walkerRobot", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=walker;
		
		aux = random.nextInt(0,cellsList.size()-1);
		Pawn pawn = new Pawn(2, "pawn", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=pawn;

		aux = random.nextInt(0,cellsList.size()-1);
		Rook rook = new Rook(3, "rook", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=rook;

		aux = random.nextInt(0,cellsList.size()-1);
		Bishop bishop = new Bishop(4, "bishop", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=bishop;
		
		aux = random.nextInt(0,cellsList.size()-1);
		Knight knight = new Knight(5, "knight", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=knight;
		
		aux = random.nextInt(0,cellsList.size()-1);
		King king = new King(6, "king", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=king;

		aux = random.nextInt(0,cellsList.size()-1);
		Queen queen = new Queen(7, "queen", aux, width, cellsList.get(aux));
		cellsList.get(aux).robo=queen;
		
	}

	public void gerarPersonagens(int totalOfCells, int width, ArrayList<Cells> cellsList) {
		System.out.println("digite a qntd (entre 1 e " + (totalOfCells / 2) + ") de alunos:");
		int students = scan.nextInt();
		System.out.println("digite a qntd (entre 1 e " + (totalOfCells / 2) + ") de bugs:");
		int bugs = scan.nextInt();
		for (int i = 0; i < students; i++) {
			aux = random.nextInt(totalOfCells);
			Student student = new Student(i + 1, "Student" + i, aux, width, cellsList.get(aux));
			// cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		}
		for (int i = 0; i < bugs; i++) {
			aux = random.nextInt(totalOfCells);
			Bugs bug = new Bugs(i + 1, "Bugs" + i, aux, width, cellsList.get(aux));
			// cellsList.get(aux).icon=cellsList.get(aux).robo.icon;
		}

	}

}
