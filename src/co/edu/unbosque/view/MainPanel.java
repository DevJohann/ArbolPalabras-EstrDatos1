package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
	private JLabel title;
	private JLabel text;
	private JButton send;
	private JTextField input;
	
	public MainPanel() {
		
		
		setLayout(null);
		
		title = new JLabel("Arbol binario");
		title.setFont(new Font("Times new Roman", Font.BOLD, 20));
		title.setBounds(190, 20, 120, 30);
		add(title);
		
		text = new JLabel("Ingrese una palabra:");
		text.setBounds(50, 156, 120, 30);
		add(text);
		
		send = new JButton("Enviar");
		send.setBounds(200, 220, 80, 20);
		add(send);
		
		input = new JTextField();
		input.setBounds(180, 160, 120, 20);
		add(input);
		
		setVisible(true);
	}

	/**
	 * @return the title
	 */
	public JLabel getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(JLabel title) {
		this.title = title;
	}

	/**
	 * @return the send
	 */
	public JButton getSend() {
		return send;
	}

	/**
	 * @param send the send to set
	 */
	public void setSend(JButton send) {
		this.send = send;
	}

	/**
	 * @return the input
	 */
	public JTextField getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(JTextField input) {
		this.input = input;
	}

}
