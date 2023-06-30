package controller;

import java.util.ArrayList;

import view.Cells;

public class Bugs extends Robot {

	public Bugs(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "#";
		//cell.icon = this.icon;
	}

	@Override
	public boolean forwardOrBackward(int id, ArrayList<Cells> cellsList, int width) {
		return false;
	}


	@Override
	public int showPossibilities(int id, ArrayList<Cells> cellsList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int notShowPossibilities(int id, ArrayList<Cells> cellsList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean limite(int iD, ArrayList<Cells> cellsList, int newId) {
		// TODO Auto-generated method stub
		return false;
	}

}
