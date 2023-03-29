package co.edu.unbosque.model;

public class Tree {

	private Node root;
	private Stack stack;

	public Tree() {
		root = null;
		stack = new Stack();
	}

	public void insertNode(char data, int dataAscii) {
		Node newNode = new Node(dataAscii, data);
		if (root == null) {
			root = newNode;
		} else {
			Node ant = root, aux = root;
			while (aux != null) {
				ant = aux;
				if (dataAscii < aux.getData()) {
					aux = aux.getLeft();
				} else {
					aux = aux.getRight();
				}
			}
			if (dataAscii < ant.getData()) {
				ant.setLeft(newNode);
			} else {
				ant.setRight(newNode);
			}
		}
	}

	public void showInOrderR(Node root) {
		if (root != null) {
			showInOrderR(root.getLeft());
			System.out.println(root.getData() + " ");
			showInOrderR(root.getRight());
		}
	}

	public void showInOrderR() {
		showInOrderR(root);
		System.out.println();
	}

	public void showInOrder(Node node) {
		if (root == null) {
			return;
		}
		Node currentNode = root;
		Node response = null;
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			}
			response = stack.pop();
			System.out.print(response.getData() + " ");
			currentNode = response.getRight();
		}
	}

	/*
	 * public Node searchNode(Node node, int data) { if (node == null ||
	 * node.getDataAscii() == data) { return node; } if (data < node.getDataAscii())
	 * { return searchNode(node.getLeft(), data); } else { return
	 * searchNode(node.getRight(), data); } }
	 */
	public void showPreOrder() {
		if (root == null) {
			return;
		}
		stack.push(root);
		while (!stack.isEmpty()) {
			Node newNode = stack.pop();
			System.out.print(newNode.getData() + " ");

			if (newNode.getRight() != null) {
				stack.push(newNode.getRight());
			}
			if (newNode.getLeft() != null) {
				stack.push(newNode.getLeft());
			}
		}
	}

	public void showPostOrder() {

	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}
