package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import view.Cells;

public class walkerRobot extends Robot implements RobotMovement {

	public Scanner scan = new Scanner(System.in);

	public walkerRobot(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "W";
		cell.icon = this.icon;
	}

	public int numberOfPlaces;

	public void action() {

	}

	@Override
	public boolean forwardOrBackward(int atualId, ArrayList<Cells> cellsList, int newId) {
		showPossibilities(atualId,cellsList);
		
		if(limite(atualId, cellsList, newId))
			return true;
		else
			return false;
	}

	@Override
	public boolean limite(int atualId, ArrayList<Cells> cellsList, int newId) {
		Boolean sentence = cellsList.get(newId).positionY==cellsList.get(atualId).positionY;

		return sentence;
	}

	@Override
	public int showPossibilities(int id, ArrayList<Cells> cellsList) {
		for (Cells cells : cellsList) {
			if((cells.id-id)%8==0) {
				Border margin = BorderFactory.createEmptyBorder(5, 5, 5, 5);
				Border colorBorder = BorderFactory.createEtchedBorder(Color.blue, Color.blue);
				cells.setBorder(BorderFactory.createCompoundBorder(margin, colorBorder));
				System.out.println(cells.id);
			}
		}
		return 0;
	}

	@Override
	public int notShowPossibilities(int id, ArrayList<Cells> cellsList) {
		for (Cells cells : cellsList) {
			if((cells.id-id)%8==0) {
				cells.setBorder(BorderFactory.createEmptyBorder());
			}
		}
		return 0;
	}

}
