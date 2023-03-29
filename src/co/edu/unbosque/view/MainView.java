package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainView extends JFrame{
	
	private MainPanel MP;

	public MainView() {
		MP = new MainPanel();

		getContentPane().add(MP, BorderLayout.CENTER);
		setVisible(true);
	//	setLayout(null);
		setSize(500, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @return the mP
	 */
	public MainPanel getMP() {
		return MP;
	}

	/**
	 * @param mP the mP to set
	 */
	public void setMP(MainPanel mP) {
		MP = mP;
	}
	
}
