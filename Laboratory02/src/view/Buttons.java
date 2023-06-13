package view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JButton {

	JPanel buttonPanel;

	public Buttons(String nameButton, JPanel panel) {

		setPreferredSize(new Dimension(100, 40));
		setText(nameButton);
		buttonPanel = panel;

	}

}
