package co.edu.unbosque.model;

public class Tree {

	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void insertNode(char data, int dataAscii) {
		Node newNode = new Node(dataAscii, data);
		if(root == null) {
			root = newNode;
		}else {
			Node ant = root, aux = root;
			while(aux != null) {
				ant = aux;
				if(dataAscii < aux.getData()) {
					aux = aux.getLeft();
				}else {
					aux = aux.getRight();
				}
			}
			if(dataAscii < ant.getData()) {
				ant.setLeft(newNode);
			}else {
				ant.setRight(newNode);
			}
		}
	}

}
