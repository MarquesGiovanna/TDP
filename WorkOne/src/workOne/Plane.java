package workOne;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Plane {

	public ArrayList<Cells> cellsList;
	public ArrayList<Robot> robot;
	public int width;
	public int height;
	public int aux;
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	Generate g = new Generate();

	public Plane(int sizeX, int sizeY) {
		width = sizeX;
		height = sizeY;
		cellsList = new ArrayList<Cells>();
		g.generatePlane(this.width, this.height, this.cellsList);
		g.generateRobot(sizeX * sizeY, this.width, cellsList);
		g.gerarPersonagens(sizeX * sizeY, this.width, cellsList);

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

}
