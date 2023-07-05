package view;

import javax.swing.JFrame;

public class StartGame extends JFrame {
	//Atributos
	private PanelGame board;
	private UpperPanel upper;

	
	public StartGame() {

		//características
		setSize(900, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//inicialização dos atributos
		board = new PanelGame(this);
		upper = new UpperPanel(board);
		
		add(upper);
		add(board);
		setVisible(true);	
	}

//	public void Start() {
//
//		p.userMove();
//		p.showBoard();
//		System.out.println("Do you want to continue the game?\n0 - continue\n1 - leave");
//		int continuation = scan.nextInt();
//		if (continuation == 0)
//			Start();
//		System.out.println("Scores:");
//		p.printScores();
//		System.out.println("Positions:");
//		p.printPositions();
//	}

}
