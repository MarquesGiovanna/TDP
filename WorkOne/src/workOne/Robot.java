package workOne;

import java.util.ArrayList;

public abstract class Robot extends Coordinates implements RobotMovement {

	public int id;
	public String name;
	public Plane plane;
	public ArrayList<Integer> positions = new ArrayList<>();
	public ArrayList<Integer> score = new ArrayList<>();

	public Robot(int id, String name, int position, int planeWidthSize, Cells cell) {
		this.id = id;
		this.name = name;
		this.positionX = position / planeWidthSize;
		this.positionY = (position % planeWidthSize) - 1;

//		Cells aux = null;
//		for (int i = 0; i < plane.cellsList.size(); i++) {
//			aux = plane.cellsList.get(i);
//			if (aux.positionX == positionX && aux.positionY == positionY) {
//				aux.robo = this;
//			}
//		}
	}

//	public void moverEsquerda() {
//		for (int i = 0; i < plane.cellsList.size(); i++) {
//
//			if (plane.cellsList.get(i).robo != null) {
//				plane.cellsList.get(i).robo = null;
//				plane.cellsList.get(i - 1).robo = this;
//			}
//		}
//
//	}
//
//	public int moverDireita() {
//		return positionX + 1;
//	}

}
