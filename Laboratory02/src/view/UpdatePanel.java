package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class UpdatePanel extends JPanel {

	public UpdatePanel() {
		setPreferredSize(new Dimension(700, 550));
//		setBackground(Color.GREEN);
		
		JPanel legends = new JPanel();
		legends.setPreferredSize(new Dimension(100, 450));
		legends.setLayout(new GridLayout(10, 1));

		JPanel boxText = new JPanel();
		boxText.setPreferredSize(new Dimension(500, 450));
		boxText.setLayout(null);
		
		JLabel enrollment = new JLabel("     Enrollment");
		enrollment.setPreferredSize(new Dimension(75, 35));
		enrollment.setBorder(new BevelBorder(BevelBorder.LOWERED));

		JLabel side = new JLabel("          Side");
		side.setPreferredSize(new Dimension(75, 35));
		side.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		JTextField userEnrollment = new JTextField();
		userEnrollment.setBorder(new BevelBorder(BevelBorder.LOWERED));
		userEnrollment.setBounds(10, 5, 400, 35);

		JTextField userSide = new JTextField();
		userSide.setBorder(new BevelBorder(BevelBorder.LOWERED));
		userSide.setBounds(10, 50, 400, 35);
		
		
		JButton update = new JButton("Update");
		update.setVisible(true);
		update.setBounds(310, 250, 100, 35);
		
		legends.add(enrollment);
		legends.add(side);
		boxText.add(userEnrollment);
		boxText.add(userSide);
		boxText.add(update);
		add(legends, BorderLayout.EAST);
		add(boxText, BorderLayout.WEST); 
		
		
		
		setVisible(false);
	}
}
