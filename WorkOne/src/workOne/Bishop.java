package workOne;

public class Bishop extends Robot{

	public Bishop(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="B";
		cell.icon=this.icon;
	}

	@Override
	public int forward(int forward) {
		this.positionY-=forward;
		return positionY;
	}

	@Override
	public int backward(int backward) {
		
		return 0;
	}

}
