package controller;

import java.util.ArrayList;

import view.Cells;

public interface RobotMovement {
	
	public int showPossibilities(int id, ArrayList<Cells> cellsList);
	
	public int notShowPossibilities(int id, ArrayList<Cells> cellsList);

	public boolean forwardOrBackward(int id, ArrayList<Cells> cellsList, int width);

	public boolean limite(int iD, ArrayList<Cells> cellsList, int newId);

}
