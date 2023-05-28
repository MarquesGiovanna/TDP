package workOne;

public class Pawn extends Robot {

	public Pawn(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="P";
		cell.icon=this.icon;
		
	}

}
