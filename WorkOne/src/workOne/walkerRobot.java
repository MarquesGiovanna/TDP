package workOne;

public class walkerRobot extends Robot implements RobotMovement{
	
	
	
	public walkerRobot(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon="W";
		cell.icon=this.icon;
	}
	
	

	public int numberOfPlaces;
	
	public void action(){
		
	}

}
