package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Tree {

	private Node root;
	private Stack stack;

	public Tree() {
		root = null;
		stack = new Stack();
	}
	
	public void deleteTree() {
		root = null;
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
/*
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
	}*/

	public void showInOrder(Node node) {
		if (root == null) {
			return;
		}
		Node currentNode = root;
		Node response = null;
		String str = "";
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			}
			response = stack.pop();
			System.out.print(response.getData() + " ");
			str += response.getData()+" ";
			currentNode = response.getRight();
		}
		JOptionPane.showMessageDialog(null, str);
	}

	/*
	 * public Node searchNode(Node node, int data) { if (node == null ||
	 * node.getDataAscii() == data) { return node; } if (data < node.getDataAscii())
	 * { return searchNode(node.getLeft(), data); } else { return
	 * searchNode(node.getRight(), data); } }
	 */
	public void showPreOrder() {
		String str = "";
		if (root == null) {
			return;
		}
		stack.push(root);

		while (!stack.isEmpty()) {
			Node newNode = stack.pop();
			System.out.print(newNode.getData() + " ");
			str += newNode.getData()+" ";
			if (newNode.getRight() != null) {
				stack.push(newNode.getRight());
			}
			if (newNode.getLeft() != null) {
				stack.push(newNode.getLeft());
			}
		}
		JOptionPane.showMessageDialog(null, str);
	}

	public void showPostOrder() {
		if (root == null) {
			return;
		}
		String str = "";
		Stack stack2 = new Stack();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node newNode = stack.pop();
			stack2.push(newNode);

			if (newNode.getLeft() != null) {
				stack.push(newNode.getLeft());
			}
			if (newNode.getRight() != null) {
				stack.push(newNode.getRight());
			}
		}

		while (!stack2.isEmpty()) {
			Node newNode = stack2.pop();
			System.out.print(newNode.getData() + " ");
			str += newNode.getData() + " ";
		}
		JOptionPane.showMessageDialog(null, str);
	}
	
	public void showPostOrden(Node roott) {
		if(roott != null) {
			showPostOrden(roott.getLeft());
			showPostOrden(roott.getRight());
			System.out.println(roott.getData()+" ");
		}
	}
	
	public void showPostOrden() {
		System.out.println("\n-------------\n");
		showPostOrden(root);
		System.out.println();
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}
