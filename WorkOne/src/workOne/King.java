package workOne;

public class King extends Robot{

	public King(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="K";
		cell.icon=this.icon;
	}

}
