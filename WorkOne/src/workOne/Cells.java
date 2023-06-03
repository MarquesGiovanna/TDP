package workOne;

public class Cells extends Coordinates {

	public int id;
	public Robot robo;

	public Cells(int id, int x, int y) {
		this.id = id;
		positionX = x;
		positionY = y;
		robo = null;
		icon = "-";
	}

	public void resetCell() {
		this.icon = "-";
		this.robo = null;
	}

	public void exchangeCell(Cells atual) {
		this.robo = atual.robo;
		this.icon = atual.icon;
		this.robo.positionX = this.positionX;
		this.robo.positionY = this.positionY;
	}

	public void printCell() {

		System.out.print(icon + " ");

	}
}
