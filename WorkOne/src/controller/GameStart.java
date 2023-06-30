package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import view.PanelGame;

public class GameStart implements ActionListener {

	private String name = " ";
	private JTextField userName;
	private JLabel playerName;
	private PanelGame panelGame;

	public GameStart(JTextField userName, JLabel namePlayer, PanelGame panelBoard) {

		panelGame = panelBoard;
		this.userName = userName;
		playerName = namePlayer;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		name = userName.getText();
		playerName.setText(name);
		panelGame.usersNames.add(name);
		userName.setVisible(false);
		playerName.setVisible(true);
		panelGame.setVisible(true);

	}

}
