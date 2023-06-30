package view;

import java.awt.Color;
import controller.Robot;
import controller.Bishop;
import controller.King;
import controller.Pawn;
import controller.Knight;
import controller.Queen;
import controller.Rook;
import controller.walkerRobot;
import controller.Student;
import controller.Bugs;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;

public class Plane extends JPanel {

	public ArrayList<Cells> cellsList;
	public ArrayList<Robot> robots = new ArrayList<Robot>();
	public int width = 8;
	public int height = 8;
	public int aux;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	Boolean clicked = false;
	public int clickId = -1;
	public int contClicks = 0;
	public Color colorRobo;
	public int scoreOverall;
	PanelGame gamePanel;
	

	public Plane(PanelGame game) { 
		cellsList = new ArrayList<Cells>();
		gamePanel = game;
		setBackground(Color.ORANGE);
		setBounds(10, 5, 576, 576);
		setLayout(null);
		generatePlane();
		generatePersonagens();
		scoreOverall = sumScore(robots);

		setVisible(true);

	}
	
	

	public int sumScore(ArrayList<Robot> robots2) {
		int sum = 0;
		for (Robot roboI : robots2)
			sum += roboI.printScore();
		scoreOverall = sum;
		return 0;
	}

	public void generatePlane() {
		Cells cell;
		for (int i = 0; i < this.width; i++) {
			for (int j = 0; j < this.height; j++) {
				cell = new Cells((8*i)+j, i, j, this.gamePanel);
				cellsList.add(cell);
				add(cell);
			}
		}
		generateRobot();
	}
	
	
	public Cells findRobot(String icon) {
		
		for (Cells cells : cellsList) {
			if(cells.icon == icon)
				return cells;
		}
		return null;
	}

	
	public void generateRobot() {
		aux = initialPosition();
		cellsList.get(aux).robo = new walkerRobot(1, "walkerRobot", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);
		

		aux = initialPosition();
		cellsList.get(aux).robo = new Pawn(2, "pawn", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);
		
		aux = initialPosition();
		cellsList.get(aux).robo = new Rook(3, "rook", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);
		
		aux = initialPosition();
		cellsList.get(aux).robo = new Bishop(4, "bishop", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Knight(5, "knight", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new King(6, "king", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);

		aux = initialPosition();
		cellsList.get(aux).robo = new Queen(7, "queen", aux, width, cellsList.get(aux));
		cellsList.get(aux).label.setText(cellsList.get(aux).robo.icon);
		robots.add(cellsList.get(aux).robo);

	}

	public void generatePersonagens() {
		for (int i = 0; i < cellsList.size() / 8; i++) {
			aux = initialPosition();
			cellsList.get(aux).robo = new Student(i + 1, "Student" + i, aux, width, cellsList.get(aux));


			aux = initialPosition();
			cellsList.get(aux).robo = new Bugs(i + 1, "Bugs" + i, aux, width, cellsList.get(aux));

		}
	}

	private int initialPosition() {
		int position = random.nextInt(1, cellsList.size() - 1);
		
		if (cellsList.get(position).robo == null) {
			return position;
		}else {
			initialPosition();
		}
		return 0;
	}
//
//	public void userMove() {
//		System.out.println("Enter the value\nNEGATIVE to BACKWARD\nPOSITIVE to FORWARD\nZERO to STAY");
//
//		int id = findId("W");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//		id = findId("R");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//		id = findId("P");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//		id = findId("B");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//		id = findId("Q");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//		id = findId("H");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//		id = findId("K");
//		cellsList.get(id).robo.forwardOrBackward(id, cellsList, this.width);
//
//	}
//
//	private int findId(String icon) {
//		for (Cells i : cellsList) {
//			if (i.icon == icon)
//				return i.id;
//		}
//		return -1;
//
//	}
//
//	public void printScores() {
//
//		for (Robot robot : robots) {
//			System.out.println(robot.name + " - " + robot.printScore());
//
//		}
//
//	}
//
//	public void printPositions() {
//		for (Robot robot : robots) {
//			System.out.println(robot.name);
//			robot.printPosition(this.width);
//
//		}
//	}

}
