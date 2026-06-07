package data_structure;

import entities.Patient;

public class BinaryTree {
	private Node root = null;

	public Node insertPatient(Node root, Patient register) {
		if (root == null) {
			return new Node(register);
		}

		if (register.getProtocolNumber() < root.register.getProtocolNumber()) {
			root.left = insertPatient(root.left, register);
		} else {
			root.right = insertPatient(root.right, register);
		}
		return root;
	}

	public void insertPatient(Patient register) {
		root = insertPatient(root, register);
	}

	public void findPatientByProtocol(Node root, int protocolNumber) {

		while (root != null) {

			if (protocolNumber == root.register.getProtocolNumber()) {
				System.out.println("Paciente encontrado!");
				return;
			}
			if (protocolNumber < root.register.getProtocolNumber()) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
		System.out.println("Paciente não encontrado");
	}

	public void findPatientByProtocol(int protocolNumber) {
		findPatientByProtocol(root, protocolNumber);
	}

	private Node removePatient(Node root, int protocolNumber) {

	    if (root == null) {
	        return null;
	    }

	    if (protocolNumber < root.register.getProtocolNumber()) {
	        root.left = removePatient(root.left, protocolNumber);

	    } else if (protocolNumber > root.register.getProtocolNumber()) {
	        root.right = removePatient(root.right, protocolNumber);

	    } else {

	        
	        if (root.left == null && root.right == null) {
	            return null;
	        }

	        
	        if (root.left == null) {
	            return root.right;
	        }

	        if (root.right == null) {
	            return root.left;
	        }

	        
	        Node successor = findMin(root.right);
	        root.register = successor.register;
	        root.right = removePatient(root.right, successor.register.getProtocolNumber());
	    }

	    return root;
	}
	
	public Node findMin(Node root) {
	    while (root.left != null) {
	        root = root.left;
	    }
	    return root;
	}
	
	public void removePatient(int protocolNumber) {
	    root = removePatient(root, protocolNumber);
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.register);
			inOrder(root.right);
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.register);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.register);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	public void findMaxPatient(Node root) {
		if (root == null) {
			System.out.println("Árvore vazia");
			return;
		}

		while (root.right != null) {
			root = root.right;
		}

		System.out.println(root.register);
	}

	public void findMaxPatient() {
		findMaxPatient(root);
	}

	public void findMinPatient(Node root) {
		if (root == null) {
			System.out.println("Árvore vazia");
			return;
		}

		while (root.left != null) {
			root = root.left;
		}

		System.out.println(root.register);
	}

	public void findMinPatient() {
		findMinPatient(root);
	}

	public int countPatients(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + countPatients(root.left) + countPatients(root.right);
	}

	public void countPatients() {
		System.out.println(countPatients(root));
	}

	public int treeHeight(Node root) {

		if (root == null) {
			return 0;
		}
		return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
	}

	public void treeHeight() {
		System.out.println(treeHeight(root));
	}

}
