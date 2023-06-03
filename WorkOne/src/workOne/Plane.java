package workOne;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Plane {

	public ArrayList<Cells> cellsList;
	public ArrayList<Robot> robots;
	public int width;
	public int height;
	public int aux;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);

	public Plane(int sizeX, int sizeY) {
		width = sizeX;
		height = sizeY;
		cellsList = new ArrayList<Cells>();
		robots = new ArrayList<Robot>();
		generatePlane();
		generateRobot();
		generatePersonagens(this.width, cellsList);

	}

	public void generatePlane() {
		int count = 0;
		for (int i = 0; i < this.width; i++) {
			for (int j = 0; j < this.height; j++) {
				Cells cell = new Cells(count, i, j);
				cellsList.add(cell);
				count++;
			}
		}
	}

	public void showBoard() {
		int count = 0;

		for (int i = 0; i < this.width; i++) {
			for (int j = 0; j < this.height; j++) {
				cellsList.get(count).printCell();
				count++;
			}
			System.out.println();
		}

	}

	public void generateRobot() {
		aux = initialPosition();
		cellsList.get(aux).robo = new walkerRobot(1, "walkerRobot", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Pawn(2, "pawn", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Rook(3, "rook", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Bishop(4, "bishop", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Knight(5, "knight", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new King(6, "king", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Queen(7, "queen", aux, width, cellsList.get(aux));
		robots.add(cellsList.get(aux).robo);

	}

	public void generatePersonagens(int width, ArrayList<Cells> cellsList) {
		System.out.println("digite a qntd (entre 1 e " + (cellsList.size() / 2) + ") de alunos:");
		int students = scan.nextInt();
		System.out.println("digite a qntd (entre 1 e " + (cellsList.size() / 2) + ") de bugs:");
		int bugs = scan.nextInt();
		for (int i = 0; i < students; i++) {
			aux = initialPosition();
			cellsList.get(aux).robo = new Student(i + 1, "Student" + i, aux, width, cellsList.get(aux));

		}
		for (int i = 0; i < bugs; i++) {
			aux = initialPosition();
			cellsList.get(aux).robo = new Bugs(i + 1, "Bugs" + i, aux, width, cellsList.get(aux));

		}
	}

	private int initialPosition() {
		int position = random.nextInt(1, cellsList.size());
		if (cellsList.get(position).robo != null)
			initialPosition();
		return position;
	}

	public void userMove() {
		System.out.println("Enter the value\nNEGATIVE to BACKWARD\nPOSITIVE to FORWARD\nZERO to STAY");
		
		int id = findId("W");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

		id = findId("R");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

		id = findId("P");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

		id = findId("B");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

		id = findId("Q");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

		id = findId("H");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

		id = findId("K");
		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);

	}

	private int findId(String icon) {
		for (Cells i : cellsList) {
			if (i.icon == icon)
				return i.id;
		}
		return -1;

	}

	public void printScores() {

		for (Robot robot : robots) {
			System.out.println(robot.name + " - " + robot.printScore());

		}

	}

	public void printPositions() {
		for (Robot robot : robots) {
			System.out.println(robot.name);
			robot.printPosition(this.width);

		}
	}

}
