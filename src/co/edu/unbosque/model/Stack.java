package co.edu.unbosque.model;

public class Stack {

	private NodeStack head;

	public Stack() {
		head = null;
	}

	public void push(Node data) {
		NodeStack newNode = new NodeStack(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public Node pop() {
		if (head != null) {
			NodeStack data = head;
			head = head.getNext();
			return data.getData();
		}
		return null;
	}

	public boolean isEmpty() {
		return head == null;
	}

}
