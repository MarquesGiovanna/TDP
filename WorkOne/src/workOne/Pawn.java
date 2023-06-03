package workOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Pawn extends Robot {
	public Scanner scan = new Scanner(System.in);

	public Pawn(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "P";
		cell.icon = this.icon;

	}

	@Override
	public int forwardOrBackward(int atualId, ArrayList<Cells> cellsList, int width) {
		System.out.println("How many cells the Pawn will walk?");
		int howManyCell = scan.nextInt();
		Cells atualCell = cellsList.get(atualId);
		int newId = atualId - howManyCell;
		Cells newCell = cellsList.get(newId);

		if (limite(newId, cellsList, howManyCell, width)) {
			System.out.println("Robo nao pode ser movido, pois a posicao sugerida não esta dentro do tabuleiro");
			forwardOrBackward(atualId, cellsList, width);
		} else {
			this.score.add(hasCharacter(cellsList.get(newId)));
			newCell.exchangeCell(atualCell);
			atualCell.resetCell();
			this.positions.add(newId);
		}
		return 0;
	}

	@Override
	public boolean limite(int newId, ArrayList<Cells> cellsList, int howManyCell, int width) {
		Boolean sameLine = cellsList.get(newId).positionX != cellsList.get(newId + howManyCell).positionX;
		Boolean offBoard = newId < 0 || newId > cellsList.size() - 1;
		Boolean amount = (howManyCell < -2 && howManyCell > 2);
		return sameLine || offBoard || amount;
	}

}
