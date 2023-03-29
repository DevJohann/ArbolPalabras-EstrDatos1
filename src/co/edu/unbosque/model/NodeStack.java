package co.edu.unbosque.model;

public class NodeStack {
	
	private NodeStack next;
	private int data;
	
	public NodeStack(int data) {
		this.data = data;
		next = null;
	}

	public NodeStack getNext() {
		return next;
	}

	public void setNext(NodeStack next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
