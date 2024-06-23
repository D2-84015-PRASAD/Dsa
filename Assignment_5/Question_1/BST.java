package Question_1;

public class BST {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		} else {
			addNode(root, value);
		}
	}

	public void addNode(Node travRoot, int value) {
		if (value < travRoot.data) {
			if (travRoot.left == null) {
				travRoot.left = new Node(value);
				return;
			} else {
				addNode(travRoot.left, value);
			}
		} else {
			if (travRoot.right == null) {
				travRoot.right = new Node(value);
			} else {
				addNode(travRoot.right, value);
			}
		}
	}

	public void preorder() {
		System.out.print("Preorder : ");
		preorder(root);
		System.out.print(" ");
	}

	public void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
}
