package workOne;

public class Bugs extends Robot{

	public Bugs(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
			this.icon="#";
			cell.icon=this.icon;
	}

}
