package workOne;

public class Rook extends Robot{

	public Rook(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="R";
		cell.icon=this.icon;
	}

}
