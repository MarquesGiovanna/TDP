package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.NewPosition;

public class PanelGame extends JPanel {

	Plane p;
	public ArrayList<String> usersNames = new ArrayList<>();
	public int scoreOverall = 0;
	public int bug = 0;
	public int student = 0;
	JLabel overallScore;
	JLabel bugAndStudent;
	RobotPanel robotPanel;
	JButton check;
	JButton nextMove;
	JButton exit;
	public int mouseClicks;
	public Color corRobo;
	public ArrayList<NewPosition> positions;
	public NewPosition positionTemp;

	public PanelGame() {
		positions = new ArrayList<>();
		positionTemp = new NewPosition();
		positionTemp.icon = " ";
		positionTemp.id = 0;
		p = new Plane(this);
		setBounds(20, 75, 860, 615);
		setBackground(Color.GREEN);
		setLayout(null);
		add(p);
		scoreOverall = p.scoreOverall;

		overallScore = new JLabel("score: " + scoreOverall);
		overallScore.setBounds(596, 10, 260, 30);
		overallScore.setBackground(Color.GREEN);
		overallScore.setBorder(BorderFactory.createEtchedBorder());
		add(overallScore);

		bugAndStudent = new JLabel("overall: bug:" + bug + " student: " + student);
		bugAndStudent.setBounds(596, 50, 260, 30);
		bugAndStudent.setBackground(Color.GREEN);
		bugAndStudent.setBorder(BorderFactory.createEtchedBorder());
		add(bugAndStudent);

		robotPanel = new RobotPanel(this);
		add(robotPanel);

		check = new JButton("CHECK");
		check.setBounds(596, 240, 100, 30);
		check.setBackground(Color.GREEN);
		check.setVisible(true);
		add(check);
		check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (NewPosition position : positions) {
					System.out.println("Robo: " + position.icon + " id: " + position.id);
				}
				super.mouseClicked(e);
			}
		});

		nextMove = new JButton("NEXT MOVE");
		nextMove.setBounds(596, 275, 100, 30);
		nextMove.setBackground(Color.GREEN);
		nextMove.setVisible(true);
		add(nextMove);

		exit = new JButton("EXIT");
		exit.setBounds(596, 310, 100, 30);
		exit.setBackground(Color.GREEN);
		exit.setVisible(true);
		add(exit);

		setVisible(false);
	}

}
