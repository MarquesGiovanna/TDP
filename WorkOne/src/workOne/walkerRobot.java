package workOne;

import java.util.ArrayList;
import java.util.Scanner;

public class walkerRobot extends Robot implements RobotMovement {

	public Scanner scan = new Scanner(System.in);

	public walkerRobot(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "W";
		cell.icon = this.icon;
	}

	public int numberOfPlaces;

	public void action() {

	}

	@Override
	public int forwardOrBackward(int atualId, ArrayList<Cells> cellsList, int width) {
		
		System.out.println("How many cells the walkerRobot will walk?");
		int howManyCell = scan.nextInt();
		int newId = atualId - (howManyCell * width);

		if (limite(newId, cellsList, howManyCell, width)) {
			System.out.println("The walkerRobot can't move, because the suggested position is not inside the board");
			forwardOrBackward(atualId, cellsList, width);
		} else {
			Cells atualCell = cellsList.get(atualId);
			Cells newCell = cellsList.get(newId);
			this.score.add(hasCharacter(cellsList.get(newId)));
			newCell.exchangeCell(atualCell);
			atualCell.resetCell();
			this.positions.add(newId);

		}
		return 0;
	}

	@Override
	public boolean limite(int newId, ArrayList<Cells> cellsList, int howManyCell, int width) {
		Boolean sentence = newId < 0 || newId > cellsList.size() - 1;

		return sentence;
	}

}
