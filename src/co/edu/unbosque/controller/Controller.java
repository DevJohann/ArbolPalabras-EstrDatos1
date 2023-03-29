package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Tree;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	private MainView MV;
	private Tree tree;

	public Controller() {
		MV = new MainView();
		tree = new Tree();
		setListeners();
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
			String dataComboBox = (String) MV.getMP().getComboBox().getSelectedItem();
			if (userInput.matches("[*a-zA-Z]{8,30}")) {
				char[] inputArray = userInput.toCharArray();
				for (char x : inputArray) {
					tree.insertNode(x, (int) x);
				}
				if (dataComboBox.equals("InOrden")) {
					tree.showInOrderR();
					System.out.println("---------");
					tree.showInOrder(tree.getRoot());
				} else if (dataComboBox.equals("PreOrden")) {
					System.out.println("PreOrden");
					tree.showPreOrder();
				} else if (dataComboBox.equals("PostOrden")) {
					System.out.println("PostOrden");
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"La palabra ingresada debe contener minimo 8 caracteres y " + "no pueden haber espacios");
			}
			break;
		}
	}
}
