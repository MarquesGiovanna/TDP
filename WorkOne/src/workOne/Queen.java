package workOne;

public class Queen extends Robot{

	public Queen(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="Q";
		cell.icon=this.icon;
	}

}
