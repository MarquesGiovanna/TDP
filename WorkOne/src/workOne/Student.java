package workOne;

import java.util.ArrayList;

public class Student extends Robot {

	public Student(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "&";
		//cell.icon = this.icon;
	}

	@Override
	public int forwardOrBackward(int id, ArrayList<Cells> cellsList, int width) {

		return 0;
	}

	@Override
	public boolean limite(int iD, ArrayList<Cells> cellsList, int quantascelulas, int width) {

		return false;
	}

}
