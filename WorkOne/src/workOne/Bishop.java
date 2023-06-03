package workOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Bishop extends Robot {

	public Scanner scan = new Scanner(System.in);

	public Bishop(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "B";
		cell.icon = this.icon;
	}

	@Override
	public int forwardOrBackward(int atualId, ArrayList<Cells> cellsList, int width) {

		System.out.println("How many cells the bishop will walk?");
		int howManyCells = scan.nextInt();
		int iD = (atualId - (howManyCells * width)) + howManyCells;
		if (limite(atualId, cellsList, howManyCells, width)) {
			System.out.println("The Bishop can't move, because the suggested position is not inside the board");
			forwardOrBackward(atualId, cellsList, width);
		} else {
			Cells atualCell = cellsList.get(atualId);
			Cells newCell = cellsList.get(iD);
			this.score.add(hasCharacter(cellsList.get(iD)));
			newCell.exchangeCell(atualCell);
			atualCell.resetCell();
			this.positions.add(iD);
		}
		return 0;
	}

	@Override
	public boolean limite(int atualId, ArrayList<Cells> cellsList, int howManyCell, int width) {
		int newId = (atualId - (howManyCell * width)) + howManyCell;
		int y = cellsList.get(atualId).positionY + howManyCell;
		Boolean offBoard = newId < 0 || newId > cellsList.size() - 1;
		Boolean amount = (howManyCell < -3 && howManyCell > 3);
		Boolean diagonalBoundary = y >= width || y < 0;
		return offBoard || amount || diagonalBoundary;
	}

}
