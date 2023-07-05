package controller;

import java.util.ArrayList;

import view.Cells;

public abstract class Robot extends Coordinates implements RobotMovement {

	public int id;
	public String name;
	public ArrayList<Integer> positions;
	public ArrayList<Integer> score;
	public String icon;

	public Robot(int id, String name, int position, int planeWidthSize, Cells cell) {
		this.id = id;
		this.name = name;
		score = new ArrayList<>();
		positions = new ArrayList<>();
		this.positions.add(cell.id);
		
	}


	public int printScore() {
		int scoreSum = 0;
		for (int i : score) {
			scoreSum += i;
		}
		return scoreSum;

	}

	public void printPosition(int width) {
		for (int i : positions) {
			int X = i / width;
			int Y = i % width;
			System.out.println("X: " + X + " Y: " + Y);
		}
		System.out.println();

	}


	
}
