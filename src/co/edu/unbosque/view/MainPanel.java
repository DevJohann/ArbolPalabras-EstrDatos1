package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
	private JLabel title;
	private JButton send;
	private JTextField input;
	
	public MainPanel() {
		title = new JLabel();
		title.setBounds(120, 20, 120, 30);
		add(title);
		
		send = new JButton();
		send.setBounds(120, 300, 120, 30);
		add(send);
		
		input = new JTextField();
		input.setBounds(120, 200, 120, 30);
		add(input);
		
		setVisible(true);
		setLayout(null);
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
