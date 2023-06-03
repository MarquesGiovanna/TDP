package workOne;

import java.util.ArrayList;

public abstract class Robot extends Coordinates implements RobotMovement {

	public int id;
	public String name;
	public ArrayList<Integer> positions = new ArrayList<>();
	public ArrayList<Integer> score = new ArrayList<>();

	public Robot(int id, String name, int position, int planeWidthSize, Cells cell) {
		this.id = id;
		this.name = name;
		this.positionX = position / planeWidthSize;
		this.positionY = (position % planeWidthSize);
		this.positions.add(cell.id);
	}

	public Integer hasCharacter(Cells newCell) {

		if (newCell.robo != null && newCell.robo.icon == "&")
			return 10;
		if (newCell.robo != null && newCell.robo.icon == "#")
			return -15;
		return 0;
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
