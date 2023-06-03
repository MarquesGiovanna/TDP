package workOne;

import java.util.ArrayList;
import java.util.Scanner;

public class King extends Robot {

	public Scanner scan = new Scanner(System.in);

	public King(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "K";
		cell.icon = this.icon;
	}

	@Override
	public int forwardOrBackward(int id, ArrayList<Cells> cellsList, int width) {
		System.out.println("How many cells the King will walk?");
		int howManyCell = scan.nextInt();
		int iD = (id - (howManyCell * width)) - howManyCell;

		if (limite(id, cellsList, howManyCell, width)) {
			System.out.println("The King can't move, because the suggested position is not inside the board");
			forwardOrBackward(id, cellsList, width);
		} else {
			Cells atualCell = cellsList.get(id);
			Cells newCell = cellsList.get(iD);
			this.score.add(hasCharacter(cellsList.get(iD)));
			newCell.exchangeCell(atualCell);
			atualCell.resetCell();
			this.positions.add(iD);
		}
		return 0;
	}

	public boolean limite(int atualId, ArrayList<Cells> cellsList, int howManyCell, int width) {
		int iD = (atualId - (howManyCell * width)) - howManyCell;
		int y = cellsList.get(atualId).positionY - howManyCell;
		Boolean offBoard = iD < 0 || iD > cellsList.size() - 1;
		Boolean amount = (howManyCell < -5 && howManyCell > 5);
		Boolean diagonalBoundary = y >= width || y < 0;
		return offBoard || amount || diagonalBoundary;
	}

}
