package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Screen extends JFrame {

	public Screen() {

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setPreferredSize(new Dimension(700, 50));
		buttonsPanel.setBackground(Color.black);
		setSize(700, 600);
		setLocationRelativeTo(null);
		JPanel panelsPanel = new JPanel();
		panelsPanel.setPreferredSize(new Dimension(700, 550));

		Buttons register = new Buttons("Register", new RegisterPanel());
		Buttons toList = new Buttons("To List", new ToListPanel());
		Buttons update = new Buttons("Update", new UpdatePanel());
		Buttons delete = new Buttons("Delete", new DeletePanel());


		register.addActionListener(new ActionButton(register, toList, update, delete));
		toList.addActionListener(new ActionButton(toList, register, update, delete));
		update.addActionListener(new ActionButton(update, register, toList, delete));
		delete.addActionListener(new ActionButton(delete, register, toList, update));

		buttonsPanel.add(register);
		buttonsPanel.add(toList);
		buttonsPanel.add(update);
		buttonsPanel.add(delete);

		panelsPanel.add(register.buttonPanel);
		panelsPanel.add(toList.buttonPanel);
		panelsPanel.add(update.buttonPanel);
		panelsPanel.add(delete.buttonPanel);

		add(buttonsPanel, BorderLayout.NORTH);
		add(panelsPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
