package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import view.PanelGame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameStart implements ActionListener {

	private String name;
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
		File arquivo = new File("C:\\Users\\gihra\\TDP\\WorkOne\\src\\jogadores.txt");
		FileWriter arqu;
		try {
			arqu = new FileWriter(arquivo,true);
			arqu.write(userName.getText());
			arqu.close();
		}catch(IOException ef) {
			System.out.println("Erro ao salvar a string no arquivo: " + ef.getMessage());
		}
		panelGame.usersNames.add(name);
		userName.setVisible(false);
		playerName.setVisible(true);
		panelGame.setVisible(true);

	}

}
