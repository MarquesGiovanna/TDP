package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import view.Cells;

public class King extends Robot {

	public Scanner scan = new Scanner(System.in);

	public King(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "K";
		cell.icon = this.icon;
	}

	@Override
	public boolean forwardOrBackward(int atualId, ArrayList<Cells> cellsList, int newId) {

		if (limite(atualId, cellsList, newId))
			return true;
		else
			return false;
	}

	@Override
	public boolean limite(int atualId, ArrayList<Cells> cellsList, int newId) {
		int somaAtualId = cellsList.get(atualId).positionX - cellsList.get(atualId).positionY;
		int somanewId = cellsList.get(newId).positionX - cellsList.get(newId).positionY;
		Boolean moves = somanewId == somaAtualId;
		int y = atualId-newId;
		Boolean diagonalBoundary = y % 9 == 0;
		return diagonalBoundary && moves;
	}

	@Override
	public int showPossibilities(int id, ArrayList<Cells> cellsList) {
		Cells atual = cellsList.get(id);
		for (Cells cell: cellsList) {
			if (cell.positionX - cell.positionY == atual.positionX - atual.positionY) {
				Border margin = BorderFactory.createEmptyBorder(5, 5, 5, 5);
				Border colorBorder = BorderFactory.createEtchedBorder(Color.green, Color.green);
				cell.setBorder(BorderFactory.createCompoundBorder(margin, colorBorder));
			}
		}
		return 0;
	}


	@Override
	public int notShowPossibilities(int id, ArrayList<Cells> cellsList) {
		Cells atual = cellsList.get(id);
		for (Cells cell: cellsList) {
			if (cell.positionX - cell.positionY == atual.positionX - atual.positionY) {
					cell.setBorder(BorderFactory.createEmptyBorder());
				}
			}
		
		return 0;
	}
}
