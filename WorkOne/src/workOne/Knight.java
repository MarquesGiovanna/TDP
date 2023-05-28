package workOne;

public class Knight extends Robot {

	public Knight(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="H";
		cell.icon=this.icon;
	}

}
