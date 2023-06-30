package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RegisterPanel extends JPanel {

	public RegisterPanel() {
		setPreferredSize(new Dimension(700, 550));

		JPanel legends = new JPanel();
		legends.setPreferredSize(new Dimension(100, 450));
		legends.setLayout(new GridLayout(10, 1));

		JPanel boxText = new JPanel();
		boxText.setPreferredSize(new Dimension(500, 450));
		boxText.setLayout(null);

		JLabel name = new JLabel("          Name");
		name.setPreferredSize(new Dimension(75,35));
		name.setBorder(new BevelBorder(BevelBorder.LOWERED));

		JLabel cpf = new JLabel("           CPF");
		cpf.setPreferredSize(new Dimension(75, 35));
		cpf.setBorder(new BevelBorder(BevelBorder.LOWERED));

		JLabel enrollment = new JLabel("     Enrollment");
		enrollment.setPreferredSize(new Dimension(75, 35));
		enrollment.setBorder(new BevelBorder(BevelBorder.LOWERED));

		JLabel side = new JLabel("          Side");
		side.setPreferredSize(new Dimension(75, 35));
		side.setBorder(new BevelBorder(BevelBorder.LOWERED));

		JTextField userName = new JTextField();
		userName.setBorder(new BevelBorder(BevelBorder.LOWERED));
		userName.setBounds(10, 5, 400, 35);
		userName.setBackground(Color.gray);
		userName.setBorder(BorderFactory.createTitledBorder("name"));

		JTextField userCPF = new JTextField();
		userCPF.setBorder(new BevelBorder(BevelBorder.LOWERED));
		userCPF.setBounds(10, 50, 400, 35);

		JTextField userEnrollment = new JTextField();
		userEnrollment.setBorder(new BevelBorder(BevelBorder.LOWERED));
		userEnrollment.setBounds(10, 95, 400, 35);

		JTextField userSide = new JTextField();
		userSide.setBorder(new BevelBorder(BevelBorder.LOWERED));
		userSide.setBounds(10, 140, 400, 35);
		
		JButton singUp = new JButton("Sing up");
		singUp.setVisible(true);
		singUp.setBounds(310, 250, 100, 35);

		legends.add(name);
		legends.add(cpf);
		legends.add(enrollment);
		legends.add(side);
		boxText.add(userName);
		boxText.add(userCPF);
		boxText.add(userEnrollment);
		boxText.add(userSide);
		boxText.add(singUp);
		add(legends, BorderLayout.EAST);
		add(boxText, BorderLayout.WEST); 

		setVisible(false);
	}
}
