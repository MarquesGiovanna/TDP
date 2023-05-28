package workOne;

public class Student extends Robot {

	public Student(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="&";
		cell.icon=this.icon;
	}

	@Override
	public int forward(int forward) {
		return 0;
	}

	@Override
	public int backward(int backward) {
		return 0;
	}

}
