package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	private MainView MV;

	public Controller() {
		MV = new MainView();
		execute();
	}

	public void execute() {

	}

	public void setListeners() {
		MV.getMP().getSend().addActionListener(this);
		MV.getMP().getSend().setActionCommand("EnviarBtn");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "EnviarBtn":
			String userInput = MV.getMP().getInput().getText();
			char[] inputArray = userInput.toCharArray();
			break;
		}
	}

}
