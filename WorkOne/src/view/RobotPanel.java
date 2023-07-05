package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RobotPanel extends JPanel {

	PanelGame panelGame;
	Cells cell;

	public RobotPanel(PanelGame plane) {
		panelGame = plane;
		setBackground(Color.GREEN);
		setBounds(596, 90, 260, 140);
		setBorder(BorderFactory.createEtchedBorder());
		setLayout(null);

		JButton walker = new JButton("W");
		walker.setBounds(0, 0, 65, 140);
		walker.setBorder(BorderFactory.createEtchedBorder());
		clicks("W", walker, new Color(100, 149, 237));

		JButton horse = new JButton("H");
		horse.setBounds(65, 0, 65, 70);
		horse.setBorder(BorderFactory.createEtchedBorder());
		clicks("H", horse, Color.magenta);

		JButton king = new JButton("K");
		king.setBounds(130, 0, 65, 70);
		king.setBorder(BorderFactory.createEtchedBorder());
		clicks("K", king, Color.green);

		JButton queen = new JButton("Q");
		queen.setBounds(195, 0, 65, 70);
		queen.setBorder(BorderFactory.createEtchedBorder());
		clicks("Q", queen, Color.pink);

		JButton bishop = new JButton("B");
		bishop.setBounds(65, 70, 65, 70);
		bishop.setBorder(BorderFactory.createEtchedBorder());
		clicks("B", bishop, Color.red);

		JButton pawn = new JButton("P");
		pawn.setBounds(130, 70, 65, 70);
		pawn.setBorder(BorderFactory.createEtchedBorder());
		clicks("P", pawn, Color.yellow);

		JButton rook = new JButton("R");
		rook.setBounds(195, 70, 65, 70);
		rook.setBorder(BorderFactory.createEtchedBorder());
		clicks("R", rook, Color.cyan);

		add(walker);
		add(horse);
		add(king);
		add(queen);
		add(bishop);
		add(pawn);
		add(rook);

		setVisible(true);
	}

	public void clicks(String icon, JButton button, Color cor) {

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					cell = panelGame.p.findRobot(icon);
					cell.border(cor);
					button.setBackground(cor);
					cell.robo.showPossibilities(cell.id, panelGame.p.cellsList);
					panelGame.mouseClicks = 1;
					panelGame.corRobo = cor;
				
				super.mouseClicked(e);
			}

		});
	}
}
