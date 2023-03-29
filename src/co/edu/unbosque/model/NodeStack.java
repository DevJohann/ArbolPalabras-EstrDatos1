package co.edu.unbosque.model;

public class NodeStack {

	private NodeStack next;
	private Node data;

	public NodeStack(Node data) {
		this.data = data;
		next = null;
	}

	public NodeStack getNext() {
		return next;
	}

	public void setNext(NodeStack next) {
		this.next = next;
	}

	public Node getData() {
		return data;
	}

	public void setData(Node data) {
		this.data = data;
	}

}
