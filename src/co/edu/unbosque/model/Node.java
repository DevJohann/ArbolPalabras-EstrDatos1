package co.edu.unbosque.model;

public class Node {

	private Node left;
	private Node right;
	private int dataAscii;
	private char data;
	
	public Node(int dataAscii, char data) {
		this.data = data;
		this.dataAscii = dataAscii;
		left = null;
		right = null;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return the dataAscii
	 */
	public int getDataAscii() {
		return dataAscii;
	}

	/**
	 * @param dataAscii the dataAscii to set
	 */
	public void setDataAscii(int dataAscii) {
		this.dataAscii = dataAscii;
	}

	/**
	 * @return the data
	 */
	public char getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(char data) {
		this.data = data;
	}
	
}
