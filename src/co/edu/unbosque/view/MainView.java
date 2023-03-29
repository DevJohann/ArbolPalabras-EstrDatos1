package co.edu.unbosque.view;

import javax.swing.JFrame;

public class MainView extends JFrame{
	
	private MainPanel MP;

	public MainView() {
		MP = new MainPanel();
		
		getContentPane().add(MP);
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
