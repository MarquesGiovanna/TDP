package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.Robot;

public class Cells extends JPanel {

	private int cellSize = 72;
	public int positionX;
	public int positionY;
	public String icon;
	public int id;
	public Robot robo;
	public JLabel label = new JLabel();
	PanelGame panelGame;

	public Cells(int id, int x, int y, PanelGame panelGame) {
		setBounds(y * cellSize, x * cellSize, cellSize, cellSize);
		positionX = x;
		positionY = y;
		this.panelGame = panelGame;
		icon = " ";

		click(this);
		if ((positionX + positionY) % 2 == 0) {
			setBackground(Color.WHITE);
			label.setForeground(Color.BLACK);
		} else {
			setBackground(Color.black);
			label.setForeground(Color.white);
		}
		add(label);
		label.setVisible(true);
		setVisible(true);
		this.id = id;
		robo = null;
	}

	public void click(Cells cell) {
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				if (robo != null) {
					robo.showPossibilities(id, panelGame.p.cellsList);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				if (robo != null && panelGame.clicked == false) {
					robo.notShowPossibilities(id, panelGame.p.cellsList);
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseClicked(e);
				if (!panelGame.clicked) {
					panelGame.clicked = true;
					robo.showPossibilities(id, panelGame.p.cellsList);
					panelGame.clickId = id;

				} else if (panelGame.clicked && panelGame.clickId != id) {
					panelGame.movimentoRobo(cell);
				} else {
					panelGame.clicked = false;
					robo.notShowPossibilities(id, panelGame.p.cellsList);
				}
			}
		});

	}

	public int temPersonagem() {
		if (this.icon == "&")
			return 10;
		if (this.icon == "#")
			return -15;

		return 0;
	}

	public void resetCell() {
		this.icon = " ";
		label.setText(" ");
		this.robo = null;
		label.setVisible(true);
	}

	public void exchangeCell(Cells atual) {
		this.robo = atual.robo;
		this.icon = atual.icon;
		label.setText(icon);
		label.setVisible(true);
		atual.resetCell();
	}

	public void border(Color cor) {
		Border margin = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border colorBorder = BorderFactory.createEtchedBorder(cor, cor);
		setBorder(BorderFactory.createCompoundBorder(margin, colorBorder));
	}
}
