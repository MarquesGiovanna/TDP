package controller;

public class Jogador {

	private String name;
	private int playerScore;

	public Jogador(String nameTextField) {
		name = nameTextField;
		playerScore = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPlayerScore() {
		return playerScore;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

}
