package workOne;

import java.util.ArrayList;

public class Bugs extends Robot {

	public Bugs(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "#";
		//cell.icon = this.icon;
	}

	@Override
	public int forwardOrBackward(int id, ArrayList<Cells> cellsList, int width) {
		return 0;
	}

	@Override
	public boolean limite(int newId, ArrayList<Cells> cellsList, int howManyCell, int width) {
		return false;
	}

}
