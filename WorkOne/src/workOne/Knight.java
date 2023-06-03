package workOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Knight extends Robot {

	public Scanner scan = new Scanner(System.in);

	public Knight(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "H";
		cell.icon = this.icon;
	}

	@Override
	public int forwardOrBackward(int id, ArrayList<Cells> cellsList, int width) {
		System.out.println("How many cells the Knight will walk?");
		int howManyCell = scan.nextInt();
		int iD = (id - (howManyCell * width)) - howManyCell;

		if (limite(id, cellsList, howManyCell, width)) {
			System.out.println("The Knight can't move, because the suggested position is not inside the board");
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
	
	

	@Override
	public boolean limite(int atualId, ArrayList<Cells> cellsList, int howManyCell, int width) {
		int iD = (atualId - (howManyCell * width)) + howManyCell;
		int y = cellsList.get(atualId).positionY - howManyCell;
		Boolean offBoard = iD < 0 || iD > cellsList.size() - 1;
		Boolean amount = (howManyCell < -3 && howManyCell > 3);
		Boolean diagonalBoundary = y >= width || y < 0;
		return offBoard || amount || diagonalBoundary;
	}

}
