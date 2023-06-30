package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.GameStart;

public class UpperPanel extends JPanel {

	PanelGame gameBoard;
	JTextField player;
	JLabel namePlayer;
	JButton startGame;
	JButton gameReport;

	public UpperPanel(PanelGame gameBoard) {

		this.gameBoard = gameBoard;
		setBounds(20, 10, 860, 55);
		setBackground(Color.RED);
		setLayout(null);

		player = new JTextField();
		player.setBounds(30, 0, 150, 50);
		player.setBorder(BorderFactory.createTitledBorder("Player name"));
		player.setBackground(Color.red);
		player.setVisible(true);
		add(player);

		namePlayer = new JLabel();
		namePlayer.setBounds(30, 0, 150, 50);
		namePlayer.setBorder(BorderFactory.createTitledBorder("Player"));
		namePlayer.setBackground(Color.red);
		namePlayer.setVisible(false);
		add(namePlayer);

		startGame = new JButton("START");
		startGame.setBounds(210, 10, 100, 30);
		startGame.setBackground(Color.red);
		startGame.setVisible(true);
		startGame.addActionListener(new GameStart(player, namePlayer, gameBoard));
		add(startGame);

		gameReport = new JButton("REPORT");
		gameReport.setBounds(340, 10, 100, 30);
		gameReport.setBackground(Color.red);
		gameReport.setVisible(true);
		add(gameReport);

		setVisible(true);
	}

}
