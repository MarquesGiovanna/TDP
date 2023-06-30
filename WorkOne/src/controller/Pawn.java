package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import view.Cells;

public class Pawn extends Robot {
	public Scanner scan = new Scanner(System.in);

	public Pawn(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "P";
		cell.icon = this.icon;
		
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
		Boolean sameLine = cellsList.get(atualId).positionX == cellsList.get(newId).positionX;

		Boolean amount = atualId-newId > -2 || atualId-newId < 2;
		return sameLine && amount;
	}

	@Override
	public int showPossibilities(int id, ArrayList<Cells> cellsList) {
		for (Cells cell : cellsList) {
			Boolean movimentRigth = cell.positionY < cellsList.get(id).positionY + 2;
			Boolean movimentLeft = cell.positionY > cellsList.get(id).positionY - 2;
			if (cell.positionX == cellsList.get(id).positionX && movimentRigth && movimentLeft) {
				Border margin = BorderFactory.createEmptyBorder(5, 5, 5, 5);
				Border colorBorder = BorderFactory.createEtchedBorder(Color.yellow, Color.yellow);
				cell.setBorder(BorderFactory.createCompoundBorder(margin, colorBorder));
			}

		}
		return 0;
	}

	@Override
	public int notShowPossibilities(int id, ArrayList<Cells> cellsList) {
		for (Cells cell : cellsList) {
			if (cell.positionX == cellsList.get(id).positionX)
				cell.setBorder(BorderFactory.createEmptyBorder());
		}
		return 0;
	}

}
