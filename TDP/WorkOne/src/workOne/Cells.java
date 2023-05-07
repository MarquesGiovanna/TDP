package workOne;



public class Cells extends Coordinates {
	
	public int id;
	public Robot robo;
	
	
	
	public Cells(int id, int x , int y) {
		positionX = x;
		positionY = y;
		this.id = id;
		robo =null;
		icon = "-";
	}
	
	
	
	
	
	public void printCell() {
		
		 System.out.print(icon+" ");
		
	}
}
