package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton implements ActionListener {

	Buttons buttonRegister;
	Buttons buttonToList;
	Buttons buttonUpdate;
	Buttons buttonDelete;

	public ActionButton(Buttons register, Buttons toList, Buttons update, Buttons delete) {
		buttonRegister = register;
		buttonToList = toList;
		buttonUpdate = update;
		buttonDelete = delete;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (buttonRegister.buttonPanel.isVisible())
			buttonRegister.buttonPanel.setVisible(false);
		else
			buttonRegister.buttonPanel.setVisible(true);
		buttonToList.buttonPanel.setVisible(false);
		buttonUpdate.buttonPanel.setVisible(false);
		buttonDelete.buttonPanel.setVisible(false);

	}

}
