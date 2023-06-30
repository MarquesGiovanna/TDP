package controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import view.Cells;

public class Knight extends Robot {

	public Scanner scan = new Scanner(System.in);

	public Knight(int id, String name, int position, int planeWidthSize, Cells cell) {
		super(id, name, position, planeWidthSize, cell);
		this.icon = "H";
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
	public int showPossibilities(int id, ArrayList<Cells> cellsList) {
		Cells atual = cellsList.get(id);
		if (id - 16 < 0) {
			for (int i = 0; i <= id + 16; i++)
				borderFac(cellsList.get(i), atual);
		} else if (id + 16 > 63) {
			for (int i = id - 16; i <= 63; i++)
				borderFac(cellsList.get(i), atual);
		} else {
			for (int i = id - 16; i <= id + 16; i++)
				borderFac(cellsList.get(i), atual);
		}

		return 0;
	}

	private void borderFac(Cells cellI, Cells atual) {
		if (cellI.positionX - cellI.positionY == atual.positionX - atual.positionY) {
			Border margin = BorderFactory.createEmptyBorder(5, 5, 5, 5);
			Border colorBorder = BorderFactory.createEtchedBorder(Color.magenta, Color.magenta);
			cellI.setBorder(BorderFactory.createCompoundBorder(margin, colorBorder));
		}

	}

	@Override
	public int notShowPossibilities(int id, ArrayList<Cells> cellsList) {
		if (id - 16 < 0) {
			for (int i = 0; i <= id + 16; i++)
				cellsList.get(i).setBorder(BorderFactory.createEmptyBorder());
		} else if (id + 16 > 63) {
			for (int i = id - 16; i <= 63; i++)
				cellsList.get(i).setBorder(BorderFactory.createEmptyBorder());
		} else {
			for (int i = id - 16; i <= id + 16; i++)
				cellsList.get(i).setBorder(BorderFactory.createEmptyBorder());
		}

		return 0;

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

}
